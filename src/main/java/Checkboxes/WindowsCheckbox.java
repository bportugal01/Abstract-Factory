/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
// Implementação concreta da interface Checkbox para o sistema Windows
public class WindowsCheckbox implements Checkbox {

    // Método responsável por renderizar o checkbox específico do Windows
    @Override
    public void paint() {
        System.out.println("Você criou o WindowsCheckbox.");
    }
}