
// x(t) = 0.5 × at2 + vit + xi
public class GravityCalculator {

  // initial velocity
  private double vI;
  // time
  private double t;
  // altitude
  private double a;
  // initial position
  private double xI;

  public GravityCalculator(double vI, double t, double a, double xI) {
    this.vI = vI;
    this.t = t;
    this.a = a;
    this.xI = xI;
  }

  double determineFallingObjectPosition(double a, double t, double vI, double xI){
    return 0.5 * a * t * 2 + vI * t + xI;
  }

  public double getvI() {
    return vI;
  }

  public void setvI(double vI) {
    this.vI = vI;
  }

  public double getT() {
    return t;
  }

  public void setT(double t) {
    this.t = t;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getxI() {
    return xI;
  }

  public void setxI(double xI) {
    this.xI = xI;
  }
}
