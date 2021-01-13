package Ivan.com;

public class BaseConverter {
        private double celcium;
        private double farengheit;
        private double kelvin;

        public BaseConverter(double celcium) {
            this.celcium = celcium;
        }
        public void convert (double celcium) {
            kelvin = celcium + 273.16;
            farengheit = celcium * 1.8 + 32;
            System.out.println("T[K] = " + kelvin + " T[F] = " + farengheit);
        }
}


