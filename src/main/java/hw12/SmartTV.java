package hw12;

    public class SmartTV extends TV {
        protected String wifi;
        protected String opSysytem;

        public SmartTV(String name, String model, int size, String wifi, String opSysytem) {
            super(name, model, size);
            this.wifi = wifi;
            this.opSysytem = opSysytem;
        }

        public void prinCondition(){
            System.out.println("SmartTv is working");
        }



        public String getWifi() {
            return wifi;
        }

        public String getOpSysytem() {
            return opSysytem;
        }
    }

