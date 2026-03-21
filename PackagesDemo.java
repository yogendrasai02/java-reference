// import samplePackage.*; --> imports A
// import samplePackage.sampleNestedPackage.*; --> imports B
import samplePackage.*;
import samplePackage.sampleNestedPackage.SamplePackageClassB;

public class PackagesDemo {
  public static void main(String[] args) {
    SamplePackageClassA a = new SamplePackageClassA();
    SamplePackageClassB b = new SamplePackageClassB();
  }
}
