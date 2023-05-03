package org.example;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public JPanel panelMenu;
    public JPanel panelSelectLvl;
    public JPanel panelSettings;
    public JLabel etiqueta;
    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
    }
    private void colocarBotones() {
        JButton selectlvl = new JButton();
        JButton back = new JButton();
        JButton playselectlvl = new JButton();
        JButton pause = new JButton();
        JButton editorlvl = new JButton();
        JButton settings = new JButton();
        JButton playercustom = new JButton();

        //Boton 1 (select level)
        //Texto en el boton
        selectlvl.setText("Play");
        //Posición (x,y) y Ancho y Alto del boton.
        selectlvl.setBounds(500, 500,100,50);
        //Funcionamiento del boton
        selectlvl.setEnabled(true);
        selectlvl.setMnemonic('p');
        /*
        //Agregamos color al texto al boton
        selectlvl.setForeground(Color.white);
        //Establece pintar el fondo del boton
        selectlvl.setOpaque(true);
        //Cambia el color del fondo al texto en el boton
        selectlvl.setBackground(Color.black);
        //selectlvl.setHorizontalAlignment(SwingConstants.CENTER);
        */
        //Cambia la fuente(tipo de letra) del texto en el boton
        selectlvl.setFont(new Font("arial", Font.BOLD, 18));

        //Boton 2 (settings)
        settings.setText("Settings");
        settings.setBounds(500, 600,100,50);
        settings.setEnabled(true);
        settings.setMnemonic('s');

        //Boton 3 (level editor)
        editorlvl.setText("Level Editor");
        editorlvl.setBounds(650, 500,100,50);
        editorlvl.setEnabled(true);
        editorlvl.setMnemonic('e');

        //Boton 4 (custom player)
        playercustom.setText("Custom Player");
        playercustom.setBounds(350, 500,100,50);
        playercustom.setEnabled(true);
        playercustom.setMnemonic('c');

        //Boton 5 (play level)
        playselectlvl.setText("level 1");
        playselectlvl.setBounds(350, 500,100,50);
        playselectlvl.setEnabled(true);
        playselectlvl.setMnemonic('1');

        //Boton 6 (back)
        back.setText("<---");
        back.setBounds(350, 500,100,50);
        back.setEnabled(true);
        back.setMnemonic('b');

        //Boton 7 (pause)
        pause.setText("Pause");
        pause.setBounds(350, 500,100,50);
        pause.setEnabled(true);
        pause.setMnemonic('|');

        //Boton 8 (close)
        playercustom.setText("X");
        playercustom.setBounds(350, 500,100,50);
        playercustom.setEnabled(true);
        playercustom.setMnemonic('0');

        //Agregamos el boton al panel a la ventana
        panelMenu.add(selectlvl);
        panelMenu.add(settings);
        panelMenu.add(editorlvl);
        panelMenu.add(playercustom);
    }
    private void resolutionDespegable() {
        JCheckBox resolutionscale = new JCheckBox();
        /*
        Resolucion: 640x360(360p), 854x480(480p), 1280x720(720p)[HD], 1920x1080(1080p)[FHD], 2560x1440(1440p)[2K]
        640×480 800x600 1024×768 1152×864 1920×1440 2048×1536   (4:3)
        850×480 1280x720 1280×768 1366×768 1600x900 1920×1080 2048×1152 2560×1440   (16:9)
        1280×768 1280×800 1440×900 1920×1200 2560×1600  (16:10)
         */
        String [] resolutionsVideo = {"", "", "", "", "", "", "", "", "",};

        String [] resolutions4_3 = {"", "", "", "", "", "", "", "", "",};

        String [] resolutions16_9 = {"", "", "", "", "", "", "", "", "", "",};

        String [] resolutions16_10 = {"", "", "", "", ""};

    }
    private void colocarPaneles() {
        //Creacion del panel
        panelMenu = new JPanel();
        panelSelectLvl = new JPanel();
        panelSettings = new JPanel();

        //Menu Principal
        //Agregamos el panel a la ventana
        this.getContentPane().add(panelMenu);
        //Color del panel (fondo de la ventana)
        panelMenu.setBackground(Color.BLACK);
        //Desactiva el diseño del panel
        panelMenu.setLayout(null);

        //Selector Level
        this.getContentPane().add(panelSelectLvl);
        panelSelectLvl.setBackground(Color.BLACK);
        panelSelectLvl.setLayout(null);

        //In-Game
        this.getContentPane().add(panelSelectLvl);
        panelSelectLvl.setBackground(Color.BLACK);
        panelSelectLvl.setLayout(null);

        //Settings
        JPanel panelsettings = new JPanel();
        //Agregamos el panel a la ventana
        this.getContentPane().add(panelsettings);
        //Color del panel (fondo de la ventana)
        panelsettings.setBackground(Color.BLACK);
        //Desactiva el diseño del panel
        panelsettings.setLayout(null);

        //Level Editor
        JPanel editorlvlpanel = new JPanel();
        //Agregamos el panel a la ventana
        this.getContentPane().add(editorlvlpanel);
        //Color del panel (fondo de la ventana)
        editorlvlpanel.setBackground(Color.BLACK);
        //Desactiva el diseño del panel
        editorlvlpanel.setLayout(null);

        //Custom Player
        JPanel customplayerpanel = new JPanel();
        //Agregamos el panel a la ventana
        this.getContentPane().add(customplayerpanel);
        //Color del panel (fondo de la ventana)
        customplayerpanel.setBackground(Color.BLACK);
        //Desactiva el diseño del panel
        customplayerpanel.setLayout(null);
    }

    private void colocarEtiquetas() {
        //Texto en la etiqueta
        etiqueta = new JLabel();
        //etiqueta = new JLabel("Play",SwingConstants.CENTER);
        etiqueta.setText("Beat Sound");
        //Posición (x,y) y Ancho y Alto de la etiqueta.
        etiqueta.setBounds(500, 200,100,50);
        //Establece la posicion horizontal del texto
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        //Agregamos color al texto en la etiqueta
        etiqueta.setForeground(Color.white);
        //Establece pintar el fondo de la etiqueta
        etiqueta.setOpaque(true);
        //Cambia el color del fondo al texto en la etiqueta
        etiqueta.setBackground(Color.black);
        //Cambia la fuente(tipo de letra) del texto
        etiqueta.setFont(new Font("arial", Font.PLAIN, 18));
        //Agregamos la etiqueta al panel a la ventana
        panelMenu.add(etiqueta);
    }

        /*
        Icono de la app (JFrame)
        @Override
        public Iconimage getIconImage() {
            Image retValue = Toolkit.getDefaultToolkit().getIconImage(ClassLoader.getSystemResource("URL"));
            return retValue;
        }
        */

    public Window() {
        //Ancho x Alto, de la ventana.
        setSize(1366,768);
        //Cerrar la ventana clickeando la "X".
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Titulo de la ventana.
        setTitle("BeatSound");
        //Posicion de la ventana en el centro del escritorio.
        setLocationRelativeTo(null);

        //Posición (x,y) y Ancho y Alto de la ventana.
        //setBounds(0,0,1366,768);

        setMinimumSize(new Dimension(400,600));
        setMaximumSize(new Dimension(1920,1080));

        iniciarComponentes();
    }

    private void WindowSettings() {
        //Ancho x Alto, de la Ventana
        this.setSize(1366,768);

        //Cerrar la ventana clickeando la "X"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Posicion de la ventana en el centro del escritorio
        setLocationRelativeTo(null);
    }

    void WindowLvlEditor() {
        //Ancho x Alto, de la Ventana
        this.setSize(1366,768);

        //Cerrar la ventana clickeando la "X"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Posicion de la ventana en el centro del escritorio
        setLocationRelativeTo(null);
    }

    void WindowPlayLvl() {
        //Ancho x Alto, de la Ventana
        this.setSize(1366,768);

        //Cerrar la ventana clickeando la "X"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Posicion de la ventana en el centro del escritorio
        setLocationRelativeTo(null);
    }

    void WindowPlayerEditor() {
        //Ancho x Alto, de la Ventana
        this.setSize(1366,768);

        //Cerrar la ventana clickeando la "X"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Posicion de la ventana en el centro del escritorio
        setLocationRelativeTo(null);
    }

    public void start() {

    }

}
