/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Buttons.Button;
import Buttons.MacOSButton;
import Checkboxes.Checkbox;
import Checkboxes.MacOSCheckbox;


 // A classe MacOSFactory implementa a interface GUIFactory, fornecendo 
 // implementações específicas para criar componentes de interface no estilo MacOS

public class MacOSFactory implements GUIFactory { 
    @Override
    // Implementação do método createButton() para criar um botão específico para o MacOS
    public Button createButton() {  
    // Retorna uma instância de MacOSButton
        return new MacOSButton();  
    }

    @Override
    // Implementação do método createCheckbox() para criar uma checkbox específica para o MacOS
    public Checkbox createCheckbox() {  
        return new MacOSCheckbox();  
    }
}