public class AdvancedEnum {
    enum SeasonCustomized{

        WINTER(1), SPRING(2), SUMMER(3), FALL(4);
        private int code;

        SeasonCustomized(int season) {
            this.code = season;
        }

        public int getSeason() {
            return code;
        }

        public  int getExpectedMaxTemperature(){
            switch (this) {
                case WINTER:
                    return 10;
                case SPRING:
                    return 20;
                case SUMMER:
                case FALL:
                    return 5;
                default:
                    return -1;
            }
        }
        public SeasonCustomized valueOf(int season){
         for (SeasonCustomized seasonCustomized:SeasonCustomized.values() ){
             if (seasonCustomized.getSeason()==season){
                 return seasonCustomized;
             }
         }
            throw new RuntimeException("Not found season");
        }
    };

}
