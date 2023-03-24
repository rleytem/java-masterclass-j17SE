public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        add(complexNumber.real, complexNumber.imaginary);
    }

    public void subrtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        subrtract(complexNumber.real, complexNumber.imaginary);
    }


}
