import org.sosy_lab.sv_benchmarks.Verifier;

class Main {
  public static void main(String[] args) {
    String x = Verifier.nondetString();
    Double y = Double.parseDouble(x);
    assert !y.equals(0.0);
  }
}
