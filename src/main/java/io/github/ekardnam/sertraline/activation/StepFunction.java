package io.github.ekardnam.sertraline.activation;

//step function implementation
class StepFunction extends ActivationFunction {

	public double function(double x) {
		if (x > 0) {
			return 1;
		}
		return 0;
	}

	public double derivative(double x) {
		return 1;
	}

	public boolean derivable() {
		return false;
	}

}
