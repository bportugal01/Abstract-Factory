/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Buttons.Button;
import Checkboxes.Checkbox;
import Factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */

// Classe Application que utiliza os componentes criados por uma fábrica GUIFactory
public class Application {
    private Button button;      // Botão da interface gráfica
    private Checkbox checkbox;  // Checkbox da interface gráfica

    // Construtor recebe uma fábrica que cria os componentes apropriados
    public Application(GUIFactory factory) {
        button = factory.createButton();   // Cria um botão específico para a plataforma
        checkbox = factory.createCheckbox(); // Cria um checkbox específico para a plataforma
    }

    // Método para renderizar os componentes criados
    public void paint() {
        button.paint();   // Renderiza o botão
        checkbox.paint(); // Renderiza o checkbox
    }
}