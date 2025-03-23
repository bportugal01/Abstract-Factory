
import App.Application;
import Factories.GUIFactory;
import Factories.MacOSFactory;
import Factories.WindowsFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Demo class. Everything comes together here.
 */

public class Demo {
  /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
   
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        // Obtém o nome do sistema operacional
        String osName = System.getProperty("os.name").toLowerCase();

        // Define a fábrica de acordo com o sistema operacional detectado
        if (osName.contains("mac")) {
            factory = new MacOSFactory(); // Fábrica específica para MacOS
        } else {
            factory = new WindowsFactory(); // Fábrica específica para Windows
        }

        // Cria a aplicação utilizando a fábrica selecionada
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        // Configura e inicializa a aplicação com os componentes adequados
        Application app = configureApplication();
        app.paint(); // Renderiza os componentes criados
    }
}