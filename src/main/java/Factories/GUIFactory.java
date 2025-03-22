/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Buttons.Button;
import Checkboxes.Checkbox;


 // Declaração de uma interface chamada GUIFactory
public interface GUIFactory {
    
    // Método abstrato que, quando implementado, deve criar e retornar um objeto do tipo Button.
    Button createButton();  

    // Método abstrato que, quando implementado, deve criar e retornar um objeto do tipo Checkbox. 
    Checkbox createCheckbox();  
}
