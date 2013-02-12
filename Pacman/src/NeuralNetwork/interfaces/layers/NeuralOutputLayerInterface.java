package NeuralNetwork.interfaces.layers;

import java.util.ArrayList;
import java.util.Map;

/**
 * The NeuralOutputLayer will be used to group all the NeuralOutputNodes for easily
 * calculating their values.
 * 
 * @author Eric de Kruijf
 * @version 0.1
 */

public interface NeuralOutputLayerInterface {
	/**
	 * TODO
	 */
	
	/**
	 * This method gives the names for the inputnodes in a list. Used to assign the
	 * values in the next method.
	 * @param labels
	 * 		The labels.
	 */	
	public void setLabels(ArrayList<String> labels);
	
	/**
	 * When the layer is not labeled, this method can be used to return the
	 * results from the network calculation.
	 * @return
	 * 		A list containing all the output values.
	 */
	public ArrayList<Double> get();

	/**
	 * When the layer is labeled, this method will return the output labels
	 * with their respective output value in a map format.
	 * @return
	 * 		A map containing the labels as keys and the output values as values.
	 */
	public Map<String, Double> getLabeled();
	
	/**
	 * This method will evaluate the full set of NeuralOutputNodes contained in this
	 * layer.
	 */
	public void evaluate();
}
