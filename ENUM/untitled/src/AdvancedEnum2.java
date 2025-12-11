public class AdvancedEnum2 {
    enum SeasonCustomized {

        WINTER(1){
            public int getExpectedMaxTemperature() {
                return 5;
            }
        },
        SPRING(2){
            public int getExpectedMaxTemperature() {
                return 20;
            }
        },
         SUMMER(3) {
            public int getExpectedMaxTemperature() {
                return 10;
            }
        },
        FALL(4);
        private int code;

        // method
        public int getCode() {
            return code;
        }

        // Constructor-only private or (default)
        // modifiers are allowed
        SeasonCustomized(int code) {
            this.code = code;
        }

    };
}
