/**
 * Demo of multi-level hierarchical inheritance
 */

package com.zilaidawwab.javalang.inheritance.multilevelhierarchy;

public class DemoShipment {
    public static void main(String[] args) {

        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        // This volume method is coming from 1st layer, accessed from 3rd layer inheritance
        vol = shipment1.volume();
        System.out.println("Volume of Shipment 1 is: " + vol);
        System.out.println("Weight of Shipment 1 is: " + shipment1.weight);
        System.out.println("Shipping Cost: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of Shipment 2 is: " + vol);
        System.out.println("Weight of Shipment 2 is: " + shipment2.weight);
        System.out.println("Shipping Cost: $" + shipment2.cost);
        System.out.println();
    }
}
