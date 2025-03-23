/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */

// Implementação concreta da interface Checkbox para o sistema MacOS
public class MacOSCheckbox implements Checkbox {

    // Método responsável por renderizar o checkbox específico do MacOS
    @Override
    public void paint() {
        System.out.println("Você criou o MacOSCheckbox.");
    }
}