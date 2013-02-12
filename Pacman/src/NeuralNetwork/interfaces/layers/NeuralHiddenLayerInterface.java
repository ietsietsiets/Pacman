package NeuralNetwork.interfaces.layers;

import NeuralNetwork.interfaces.NeuralLayerInterface;

/**
 * The NeuralHiddenLayer will help to train the neural network more gradually. This
 * can also mean it gets harder to train it properly within reasonable time. It will
 * also contain a NeuralBiasNode to feed to the next layer.
 * 
 * @author Eric de Kruijf
 * @version 0.1
 */

public interface NeuralHiddenLayerInterface extends NeuralLayerInterface {
	/**
	 * TODO
	 */
	
	/**
	 * This method will evaluate the full set of NeuralHiddenNodes contained in this
	 * layer.
	 */
	public void evaluate();
}
