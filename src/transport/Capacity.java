package transport;

public enum Capacity {

        EXTRA_SMALL(0, 10),
        SMALL(11, 25),
        MIDDLE(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);
        private int downCapacity;
        private int upCapacity;
        Capacity(int downCapacity, int upCapacity) {
            this.downCapacity = downCapacity;
            this.upCapacity = upCapacity;
        }
        public int getDownCapacity() {
            return downCapacity;
        }

        public void setDownCapacity(int downCapacity) {
            this.downCapacity = downCapacity;
        }

        public int getUpCapacity() {
            return upCapacity;
        }

        public void setUpCapacity(int upCapacity) {
            this.upCapacity = upCapacity;
        }

        @Override
        public String toString() {
            return "Вместимость " + getDownCapacity() + " - " + getUpCapacity() + " мест";
        }
}
