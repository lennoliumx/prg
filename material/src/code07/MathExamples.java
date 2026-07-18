void main() {
  System.out.println("=== Java Math Class Examples ===");

  // Basic arithmetic helpers
  System.out.println("\n-- Basic arithmetic --");
  System.out.println("abs(-5) = " + Math.abs(-5));
  System.out.println("max(3, 7) = " + Math.max(3, 7));
  System.out.println("min(3, 7) = " + Math.min(3, 7));

  // Rounding
  System.out.println("\n-- Rounding --");
  double num = 3.75;
  System.out.println("round(3.75) = " + Math.round(num));
  System.out.println("floor(3.75) = " + Math.floor(num));
  System.out.println("ceil(3.75) = " + Math.ceil(num));

  // Power and roots
  System.out.println("\n-- Powers and roots --");
  System.out.println("pow(2, 8) = " + Math.pow(2, 8));
  System.out.println("sqrt(64) = " + Math.sqrt(64));
  System.out.println("cbrt(27) = " + Math.cbrt(27));

  // Exponential and logarithms
  System.out.println("\n-- Exponentials and logs --");
  System.out.println("exp(1) = " + Math.exp(1));       // e^1
  System.out.println("log(10) = " + Math.log(10));     // natural log
  System.out.println("log10(1000) = " + Math.log10(1000));

  // Trigonometry
  System.out.println("\n-- Trigonometry --");
  double radians = Math.toRadians(45);
  System.out.println("sin(45°) = " + Math.sin(radians));
  System.out.println("cos(45°) = " + Math.cos(radians));
  System.out.println("tan(45°) = " + Math.tan(radians));

  // Random number
  System.out.println("\n-- Random number --");
  double random = Math.random(); // value between 0.0 and 1.0
  System.out.println("random() = " + random);

  // Special constants
  System.out.println("\n-- Constants --");
  System.out.println("PI = " + Math.PI);
  System.out.println("E  = " + Math.E);

  // Sign, hypot, and degree conversion
  System.out.println("\n-- Miscellaneous --");
  System.out.println("signum(-3.5) = " + Math.signum(-3.5));
  System.out.println("hypot(3, 4) = " + Math.hypot(3, 4)); // sqrt(3² + 4²)
  System.out.println("toDegrees(π/2) = " + Math.toDegrees(Math.PI / 2));
}