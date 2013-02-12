package NeuralNetwork.interfaces.layers;

import java.util.ArrayList;

import NeuralNetwork.interfaces.NeuralLayerInterface;

/**
 * The NeuralInputLayer is used to distribute the input values correctly over the 
 * NeuralInputNodes. This can be done using the labels, or just by the order of
 * creation. It also controls how the nodes are connected to a NeuralHiddenLayer
 * or NeuralOutputLayer. It will also contain a NeuralBiasNode to feed to the next
 * layer.
 * 
 * @author Eric de Kruijf
 * @version 0.1
 */

public interface NeuralInputLayerInterface extends NeuralLayerInterface{
	/**
	 * @constructor
	 * 		The constructor is used to prepare datastructures for storing names
	 * 		and NeuralNodes.
	 */
	
	/**
	 * This method gives the names for the NeuralInputNodes in a list. Used to
	 * assign the values in the next method.
	 * @param labels
	 * 		The labels.
	 */
	public void setLabels(ArrayList<String> labels);
	
	/**
	 * The set method from the NeuralNetwork implementation is forwarded to this
	 * method.
	 * @param values
	 * 		This list contains the values which the InputNodes should have.
	 */
	public void set(ArrayList<Double> values);

}
