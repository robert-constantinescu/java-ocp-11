package fImplementingConcurrency.m3;

public class Ex13LiveLock {

    public static void run() {
        PhoneCall buddy1 = new PhoneCall("John");
        PhoneCall buddy2 = new PhoneCall("Chris");

        Hangup hangupAction = new Hangup(buddy1);

        Thread thread1 = new Thread(() -> buddy1.endCallWith(hangupAction, buddy2));
        Thread thread2 = new Thread(() -> buddy2.endCallWith(hangupAction, buddy1));
        //start both treads
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
            run();
    }

    static class Hangup {
        private PhoneCall caller;

        public Hangup(PhoneCall caller) {
            this.caller = caller;
        }

        public void setCaller(PhoneCall caller) {
            this.caller = caller;
        }

        public void end() {
            System.out.println(caller.name + " hang up");
        }
    }

    static class PhoneCall{
        private String name;
        private boolean isDone;

        public PhoneCall(String name) {
            this.name = name;
            isDone = false;
        }

        public String getName() {
            return name;
        }

        public boolean isDone() {
            return isDone;
        }


        public void endCallWith(Hangup hangup, PhoneCall buddy) {
            while (!isDone) {
                if (hangup.caller != this) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        continue;
                    }
                    continue;
                }

                if (!buddy.isDone()) {
                    System.out.println(name + ": No, you hang up, " + buddy.getName());
                    hangup.setCaller(buddy);
                    continue;
                }

                hangup.end();
                buddy.isDone = true;
                isDone = true;
            }
        }
    }
}
