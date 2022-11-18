import org.sosy_lab.sv_benchmarks.Verifier;

class Main {
  public static void main(String[] args) {
    double x = Verifier.nondetDouble();
    Double y = 1 / x;
    assert !y.isNaN();
  }
}
