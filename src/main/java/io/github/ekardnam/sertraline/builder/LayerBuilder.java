package io.github.ekardnam.sertraline.builder;

import io.github.ekardnam.sertraline.activation.ActivationFunction;
import io.github.ekardnam.sertraline.objects.Layer;

public interface LayerBuilder {

	LayerBuilder DEFAULT_BUILDER = new DefaultLayerBuilder();
	LayerBuilder SIGMOID_BUILDER = DEFAULT_BUILDER;
	LayerBuilder STEP_BUILDER = new DefaultLayerBuilder(ActivationFunction.STEP_FUNCTION);
	LayerBuilder LINEAR_BUILDER = new DefaultLayerBuilder(ActivationFunction.LINEAR_FUNCTION);
	
	public Layer build(int neurons);

}
