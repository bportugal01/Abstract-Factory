/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Buttons.Button;
import Buttons.WindowsButton;
import Checkboxes.Checkbox;
import Checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

   // Implementação da fábrica concreta para o sistema Windows
public class WindowsFactory implements GUIFactory {

    // Cria e retorna um botão específico para o ambiente Windows
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    // Crie e retorna um caixa de seleção específica para o ambiente Windows
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}