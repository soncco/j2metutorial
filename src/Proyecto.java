/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import gov.nist.core.StringTokenizer;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.util.*;

/**
 * @author USUARIO
 */
public class Proyecto extends MIDlet implements CommandListener {
  
  private boolean midletPaused = false;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
  private List listaOpciones;
  private Form frmOperaciones;
  private TextField textField;
  private ChoiceGroup choiceGroup;
  private TextField textField1;
  private StringItem stringItem;
  private Form frmMayor;
  private StringItem stringItem1;
  private TextField textField2;
  private Form frmOrdenar;
  private StringItem stringItem2;
  private TextField textField3;
  private Form frmPosicion;
  private TextField textField4;
  private TextField textField5;
  private StringItem stringItem3;
  private Command okCommand;
  private Command exitCommand;
  private Command okCommand1;
  private Command exitCommand1;
  private Command exitCommand2;
  private Command okCommand2;
  private Command okCommand3;
  private Command exitCommand3;
//</editor-fold>//GEN-END:|fields|0|
  /**
   * The Proyecto constructor.
   */
  public Proyecto() {
  }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
  /**
   * Initializes the application. It is called only once when the MIDlet is
   * started. The method is called before the
   * <code>startMIDlet</code> method.
   */
  private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
      // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
      // write post-initialize user code here
  }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
  /**
   * Performs an action assigned to the Mobile Device - MIDlet Started point.
   */
  public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
      // write pre-action user code here
    switchDisplayable(null, getListaOpciones());//GEN-LINE:|3-startMIDlet|1|3-postAction
      // write post-action user code here
  }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
  /**
   * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
   */
  public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
      // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
      // write post-action user code here
  }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
  /**
   * Switches a current displayable in a display. The
   * <code>display</code> instance is taken from
   * <code>getDisplay</code> method. This method is used by all actions in the
   * design for switching displayable.
   *
   * @param alert the Alert which is temporarily set to the display; if
   * <code>null</code>, then
   * <code>nextDisplayable</code> is set immediately
   * @param nextDisplayable the Displayable to be set
   */
  public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
      // write pre-switch user code here
    Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
    if (alert == null) {
      display.setCurrent(nextDisplayable);
    } else {
      display.setCurrent(alert, nextDisplayable);
    }//GEN-END:|5-switchDisplayable|1|5-postSwitch
      // write post-switch user code here
  }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
  /**
   * Called by a system to indicated that a command has been invoked on a
   * particular displayable.
   *
   * @param command the Command that was invoked
   * @param displayable the Displayable where the command was invoked
   */
  public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
    // write pre-action user code here
    if (displayable == frmMayor) {//GEN-BEGIN:|7-commandAction|1|54-preAction
      if (command == exitCommand1) {//GEN-END:|7-commandAction|1|54-preAction
        // write pre-action user code here
        switchDisplayable(null, getListaOpciones());//GEN-LINE:|7-commandAction|2|54-postAction
        // write post-action user code here
      } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|3|52-preAction
        try {
          // Mayor de N números.
          String numeros = textField2.getString();
          stringItem1.setText(Metodos.elementoMayor(numeros));
        } catch(Exception e) {
          stringItem1.setText("Algo está mal. " + e.toString());
        }
//GEN-LINE:|7-commandAction|4|52-postAction
        // write post-action user code here
      }//GEN-BEGIN:|7-commandAction|5|27-preAction
    } else if (displayable == frmOperaciones) {
      if (command == exitCommand) {//GEN-END:|7-commandAction|5|27-preAction
        // write pre-action user code here
        switchDisplayable(null, getListaOpciones());//GEN-LINE:|7-commandAction|6|27-postAction
        // write post-action user code here
      } else if (command == okCommand) {//GEN-LINE:|7-commandAction|7|25-preAction
        // Operaciones básicas.
        
        try {
          // Obtenemos los valores.
          double n1 = Double.parseDouble(textField.getString());
          double n2 = Double.parseDouble(textField1.getString());

          // Inicializamos el resultado.
          double resultado = 0;

          // Escogemos la operación y operamos.
          switch(choiceGroup.getSelectedIndex()) {
            case 0: // Suma.
              resultado = n1 + n2;
              break;
            case 1: // Resta.
              resultado = n1 - n2;
              break;
            case 2: // Producto.
              resultado = n1 * n2;
              break;
            case 3: // División.
              resultado = n1 / n2;
              break;
          }

          // Mostramos el resultado.          
          stringItem.setText(Double.toString(resultado));
        } catch(Exception e) {
          stringItem.setText("Algo está mal. " + e.toString());
        }
        
        
//GEN-LINE:|7-commandAction|8|25-postAction
        // write post-action user code here
      }//GEN-BEGIN:|7-commandAction|9|64-preAction
    } else if (displayable == frmOrdenar) {
      if (command == exitCommand2) {//GEN-END:|7-commandAction|9|64-preAction
        // write pre-action user code here
        switchDisplayable(null, getListaOpciones());//GEN-LINE:|7-commandAction|10|64-postAction
        // write post-action user code here
      } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|11|62-preAction
        // Ordenar N números.
        String numerosOrdenar = textField3.getString();
        stringItem2.setText(Metodos.ordenar(numerosOrdenar));
//GEN-LINE:|7-commandAction|12|62-postAction
        // write post-action user code here
      }//GEN-BEGIN:|7-commandAction|13|74-preAction
    } else if (displayable == frmPosicion) {
      if (command == exitCommand3) {//GEN-END:|7-commandAction|13|74-preAction
        // write pre-action user code here
        switchDisplayable(null, getListaOpciones());//GEN-LINE:|7-commandAction|14|74-postAction
        // write post-action user code here
      } else if (command == okCommand3) {//GEN-LINE:|7-commandAction|15|72-preAction
        // Posición de un número.

        // Obtengo los datos.
        String listaBuscar = textField4.getString();
        String numeroBuscar = textField5.getString();

        // Convierto la cadena en un vector.
        Vector arreglo = Metodos.split(listaBuscar, " ");

        // Busco el elemento.
        int posicion = arreglo.indexOf(numeroBuscar);

        // Muestro la posición.
        stringItem3.setText(Integer.toString(posicion));
//GEN-LINE:|7-commandAction|16|72-postAction
        // write post-action user code here
      }//GEN-BEGIN:|7-commandAction|17|16-preAction
    } else if (displayable == listaOpciones) {
      if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|17|16-preAction
        // write pre-action user code here
        listaOpcionesAction();//GEN-LINE:|7-commandAction|18|16-postAction
        // write post-action user code here
      }//GEN-BEGIN:|7-commandAction|19|7-postCommandAction
    }//GEN-END:|7-commandAction|19|7-postCommandAction
    // write post-action user code here
  }//GEN-BEGIN:|7-commandAction|20|
//</editor-fold>//GEN-END:|7-commandAction|20|


//<editor-fold defaultstate="collapsed" desc=" Generated Getter: listaOpciones ">//GEN-BEGIN:|14-getter|0|14-preInit
  /**
   * Returns an initialized instance of listaOpciones component.
   *
   * @return the initialized component instance
   */
  public List getListaOpciones() {
    if (listaOpciones == null) {//GEN-END:|14-getter|0|14-preInit
      // write pre-init user code here
      listaOpciones = new List("Opciones", Choice.IMPLICIT);//GEN-BEGIN:|14-getter|1|14-postInit
      listaOpciones.append("Operaciones b\u00E1sicas", null);
      listaOpciones.append("Mayor de N n\u00FAmeros", null);
      listaOpciones.append("Ordenar N n\u00FAimeros", null);
      listaOpciones.append("Encontrar posici\u00F3n", null);
      listaOpciones.append("Salir", null);
      listaOpciones.setCommandListener(this);
      listaOpciones.setSelectedFlags(new boolean[]{false, false, false, false, false});//GEN-END:|14-getter|1|14-postInit
      // write post-init user code here
    }//GEN-BEGIN:|14-getter|2|
    return listaOpciones;
  }
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: listaOpcionesAction ">//GEN-BEGIN:|14-action|0|14-preAction
  /**
   * Performs an action assigned to the selected list element in the
   * listaOpciones component.
   */
  public void listaOpcionesAction() {//GEN-END:|14-action|0|14-preAction
    // enter pre-action user code here
    String __selectedString = getListaOpciones().getString(getListaOpciones().getSelectedIndex());//GEN-BEGIN:|14-action|1|18-preAction
    if (__selectedString != null) {
      if (__selectedString.equals("Operaciones b\u00E1sicas")) {//GEN-END:|14-action|1|18-preAction
        // write pre-action user code here
        switchDisplayable(null, getFrmOperaciones());//GEN-LINE:|14-action|2|18-postAction
        // write post-action user code here
      } else if (__selectedString.equals("Mayor de N n\u00FAmeros")) {//GEN-LINE:|14-action|3|49-preAction
        // write pre-action user code here
        switchDisplayable(null, getFrmMayor());//GEN-LINE:|14-action|4|49-postAction
        // write post-action user code here
      } else if (__selectedString.equals("Ordenar N n\u00FAimeros")) {//GEN-LINE:|14-action|5|59-preAction
        // write pre-action user code here
        switchDisplayable(null, getFrmOrdenar());//GEN-LINE:|14-action|6|59-postAction
        // write post-action user code here
      } else if (__selectedString.equals("Encontrar posici\u00F3n")) {//GEN-LINE:|14-action|7|69-preAction
        // write pre-action user code here
        switchDisplayable(null, getFrmPosicion());//GEN-LINE:|14-action|8|69-postAction
        // write post-action user code here
      } else if (__selectedString.equals("Salir")) {//GEN-LINE:|14-action|9|19-preAction
        // write pre-action user code here
        exitMIDlet();//GEN-LINE:|14-action|10|19-postAction
        // write post-action user code here
      }//GEN-BEGIN:|14-action|11|14-postAction
    }//GEN-END:|14-action|11|14-postAction
    // enter post-action user code here
  }//GEN-BEGIN:|14-action|12|
//</editor-fold>//GEN-END:|14-action|12|


//<editor-fold defaultstate="collapsed" desc=" Generated Getter: frmOperaciones ">//GEN-BEGIN:|22-getter|0|22-preInit
  /**
   * Returns an initialized instance of frmOperaciones component.
   *
   * @return the initialized component instance
   */
  public Form getFrmOperaciones() {
    if (frmOperaciones == null) {//GEN-END:|22-getter|0|22-preInit
      // write pre-init user code here
      frmOperaciones = new Form("Operaciones B\u00E1sicas", new Item[]{getTextField(), getTextField1(), getChoiceGroup(), getStringItem()});//GEN-BEGIN:|22-getter|1|22-postInit
      frmOperaciones.addCommand(getOkCommand());
      frmOperaciones.addCommand(getExitCommand());
      frmOperaciones.setCommandListener(this);//GEN-END:|22-getter|1|22-postInit
      // write post-init user code here
    }//GEN-BEGIN:|22-getter|2|
    return frmOperaciones;
  }
//</editor-fold>//GEN-END:|22-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|29-getter|0|29-preInit
  /**
   * Returns an initialized instance of textField component.
   *
   * @return the initialized component instance
   */
  public TextField getTextField() {
    if (textField == null) {//GEN-END:|29-getter|0|29-preInit
      // write pre-init user code here
      textField = new TextField("N\u00FAmero 1", null, 32, TextField.ANY);//GEN-LINE:|29-getter|1|29-postInit
      // write post-init user code here
    }//GEN-BEGIN:|29-getter|2|
    return textField;
  }
//</editor-fold>//GEN-END:|29-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|30-getter|0|30-preInit
  /**
   * Returns an initialized instance of textField1 component.
   *
   * @return the initialized component instance
   */
  public TextField getTextField1() {
    if (textField1 == null) {//GEN-END:|30-getter|0|30-preInit
      // write pre-init user code here
      textField1 = new TextField("N\u00FAmero 2", null, 32, TextField.ANY);//GEN-LINE:|30-getter|1|30-postInit
      // write post-init user code here
    }//GEN-BEGIN:|30-getter|2|
    return textField1;
  }
//</editor-fold>//GEN-END:|30-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|31-getter|0|31-preInit
  /**
   * Returns an initialized instance of choiceGroup component.
   *
   * @return the initialized component instance
   */
  public ChoiceGroup getChoiceGroup() {
    if (choiceGroup == null) {//GEN-END:|31-getter|0|31-preInit
      // write pre-init user code here
      choiceGroup = new ChoiceGroup("Operaciones", Choice.POPUP);//GEN-BEGIN:|31-getter|1|31-postInit
      choiceGroup.append("Suma", null);
      choiceGroup.append("Resta", null);
      choiceGroup.append("Producto", null);
      choiceGroup.append("Divisi\u00F3n", null);
      choiceGroup.setSelectedFlags(new boolean[]{true, false, false, false});//GEN-END:|31-getter|1|31-postInit
      // write post-init user code here
    }//GEN-BEGIN:|31-getter|2|
    return choiceGroup;
  }
//</editor-fold>//GEN-END:|31-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|24-getter|0|24-preInit
  /**
   * Returns an initialized instance of okCommand component.
   *
   * @return the initialized component instance
   */
  public Command getOkCommand() {
    if (okCommand == null) {//GEN-END:|24-getter|0|24-preInit
      // write pre-init user code here
      okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|24-getter|1|24-postInit
      // write post-init user code here
    }//GEN-BEGIN:|24-getter|2|
    return okCommand;
  }
//</editor-fold>//GEN-END:|24-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|26-getter|0|26-preInit
  /**
   * Returns an initialized instance of exitCommand component.
   *
   * @return the initialized component instance
   */
  public Command getExitCommand() {
    if (exitCommand == null) {//GEN-END:|26-getter|0|26-preInit
      // write pre-init user code here
      exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|26-getter|1|26-postInit
      // write post-init user code here
    }//GEN-BEGIN:|26-getter|2|
    return exitCommand;
  }
//</editor-fold>//GEN-END:|26-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|36-getter|0|36-preInit
  /**
   * Returns an initialized instance of stringItem component.
   *
   * @return the initialized component instance
   */
  public StringItem getStringItem() {
    if (stringItem == null) {//GEN-END:|36-getter|0|36-preInit
      // write pre-init user code here
      stringItem = new StringItem("Resultado", null);//GEN-LINE:|36-getter|1|36-postInit
      // write post-init user code here
    }//GEN-BEGIN:|36-getter|2|
    return stringItem;
  }
//</editor-fold>//GEN-END:|36-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: frmMayor ">//GEN-BEGIN:|50-getter|0|50-preInit
  /**
   * Returns an initialized instance of frmMayor component.
   *
   * @return the initialized component instance
   */
  public Form getFrmMayor() {
    if (frmMayor == null) {//GEN-END:|50-getter|0|50-preInit
      // write pre-init user code here
      frmMayor = new Form("Mayor de N n\u00FAmeros", new Item[]{getTextField2(), getStringItem1()});//GEN-BEGIN:|50-getter|1|50-postInit
      frmMayor.addCommand(getOkCommand1());
      frmMayor.addCommand(getExitCommand1());
      frmMayor.setCommandListener(this);//GEN-END:|50-getter|1|50-postInit
      // write post-init user code here
    }//GEN-BEGIN:|50-getter|2|
    return frmMayor;
  }
//</editor-fold>//GEN-END:|50-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|57-getter|0|57-preInit
  /**
   * Returns an initialized instance of textField2 component.
   *
   * @return the initialized component instance
   */
  public TextField getTextField2() {
    if (textField2 == null) {//GEN-END:|57-getter|0|57-preInit
      // write pre-init user code here
      textField2 = new TextField("N\u00FAmeros separados por espacios:", null, 32, TextField.ANY);//GEN-LINE:|57-getter|1|57-postInit
      // write post-init user code here
    }//GEN-BEGIN:|57-getter|2|
    return textField2;
  }
//</editor-fold>//GEN-END:|57-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|58-getter|0|58-preInit
  /**
   * Returns an initialized instance of stringItem1 component.
   *
   * @return the initialized component instance
   */
  public StringItem getStringItem1() {
    if (stringItem1 == null) {//GEN-END:|58-getter|0|58-preInit
      // write pre-init user code here
      stringItem1 = new StringItem("Resultado:", null);//GEN-LINE:|58-getter|1|58-postInit
      // write post-init user code here
    }//GEN-BEGIN:|58-getter|2|
    return stringItem1;
  }
//</editor-fold>//GEN-END:|58-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|51-getter|0|51-preInit
  /**
   * Returns an initialized instance of okCommand1 component.
   *
   * @return the initialized component instance
   */
  public Command getOkCommand1() {
    if (okCommand1 == null) {//GEN-END:|51-getter|0|51-preInit
      // write pre-init user code here
      okCommand1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|51-getter|1|51-postInit
      // write post-init user code here
    }//GEN-BEGIN:|51-getter|2|
    return okCommand1;
  }
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|53-getter|0|53-preInit
  /**
   * Returns an initialized instance of exitCommand1 component.
   *
   * @return the initialized component instance
   */
  public Command getExitCommand1() {
    if (exitCommand1 == null) {//GEN-END:|53-getter|0|53-preInit
      // write pre-init user code here
      exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|53-getter|1|53-postInit
      // write post-init user code here
    }//GEN-BEGIN:|53-getter|2|
    return exitCommand1;
  }
//</editor-fold>//GEN-END:|53-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: frmOrdenar ">//GEN-BEGIN:|60-getter|0|60-preInit
  /**
   * Returns an initialized instance of frmOrdenar component.
   *
   * @return the initialized component instance
   */
  public Form getFrmOrdenar() {
    if (frmOrdenar == null) {//GEN-END:|60-getter|0|60-preInit
      // write pre-init user code here
      frmOrdenar = new Form("Ordenar N n\u00FAmeros enteros", new Item[]{getTextField3(), getStringItem2()});//GEN-BEGIN:|60-getter|1|60-postInit
      frmOrdenar.addCommand(getOkCommand2());
      frmOrdenar.addCommand(getExitCommand2());
      frmOrdenar.setCommandListener(this);//GEN-END:|60-getter|1|60-postInit
      // write post-init user code here
    }//GEN-BEGIN:|60-getter|2|
    return frmOrdenar;
  }
//</editor-fold>//GEN-END:|60-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField3 ">//GEN-BEGIN:|67-getter|0|67-preInit
  /**
   * Returns an initialized instance of textField3 component.
   *
   * @return the initialized component instance
   */
  public TextField getTextField3() {
    if (textField3 == null) {//GEN-END:|67-getter|0|67-preInit
      // write pre-init user code here
      textField3 = new TextField("N\u00FAmeros separados por espacios:", null, 32, TextField.ANY);//GEN-LINE:|67-getter|1|67-postInit
      // write post-init user code here
    }//GEN-BEGIN:|67-getter|2|
    return textField3;
  }
//</editor-fold>//GEN-END:|67-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem2 ">//GEN-BEGIN:|68-getter|0|68-preInit
  /**
   * Returns an initialized instance of stringItem2 component.
   *
   * @return the initialized component instance
   */
  public StringItem getStringItem2() {
    if (stringItem2 == null) {//GEN-END:|68-getter|0|68-preInit
      // write pre-init user code here
      stringItem2 = new StringItem("Resultado:", null);//GEN-LINE:|68-getter|1|68-postInit
      // write post-init user code here
    }//GEN-BEGIN:|68-getter|2|
    return stringItem2;
  }
//</editor-fold>//GEN-END:|68-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|61-getter|0|61-preInit
  /**
   * Returns an initialized instance of okCommand2 component.
   *
   * @return the initialized component instance
   */
  public Command getOkCommand2() {
    if (okCommand2 == null) {//GEN-END:|61-getter|0|61-preInit
      // write pre-init user code here
      okCommand2 = new Command("Ok", Command.OK, 0);//GEN-LINE:|61-getter|1|61-postInit
      // write post-init user code here
    }//GEN-BEGIN:|61-getter|2|
    return okCommand2;
  }
//</editor-fold>//GEN-END:|61-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|63-getter|0|63-preInit
  /**
   * Returns an initialized instance of exitCommand2 component.
   *
   * @return the initialized component instance
   */
  public Command getExitCommand2() {
    if (exitCommand2 == null) {//GEN-END:|63-getter|0|63-preInit
      // write pre-init user code here
      exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|63-getter|1|63-postInit
      // write post-init user code here
    }//GEN-BEGIN:|63-getter|2|
    return exitCommand2;
  }
//</editor-fold>//GEN-END:|63-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: frmPosicion ">//GEN-BEGIN:|70-getter|0|70-preInit
  /**
   * Returns an initialized instance of frmPosicion component.
   *
   * @return the initialized component instance
   */
  public Form getFrmPosicion() {
    if (frmPosicion == null) {//GEN-END:|70-getter|0|70-preInit
      // write pre-init user code here
      frmPosicion = new Form("Posici\u00F3n de un elemento", new Item[]{getTextField4(), getTextField5(), getStringItem3()});//GEN-BEGIN:|70-getter|1|70-postInit
      frmPosicion.addCommand(getOkCommand3());
      frmPosicion.addCommand(getExitCommand3());
      frmPosicion.setCommandListener(this);//GEN-END:|70-getter|1|70-postInit
      // write post-init user code here
    }//GEN-BEGIN:|70-getter|2|
    return frmPosicion;
  }
//</editor-fold>//GEN-END:|70-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField4 ">//GEN-BEGIN:|77-getter|0|77-preInit
  /**
   * Returns an initialized instance of textField4 component.
   *
   * @return the initialized component instance
   */
  public TextField getTextField4() {
    if (textField4 == null) {//GEN-END:|77-getter|0|77-preInit
      // write pre-init user code here
      textField4 = new TextField("N\u00FAmeros separados por espacios:", null, 32, TextField.ANY);//GEN-LINE:|77-getter|1|77-postInit
      // write post-init user code here
    }//GEN-BEGIN:|77-getter|2|
    return textField4;
  }
//</editor-fold>//GEN-END:|77-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField5 ">//GEN-BEGIN:|78-getter|0|78-preInit
  /**
   * Returns an initialized instance of textField5 component.
   *
   * @return the initialized component instance
   */
  public TextField getTextField5() {
    if (textField5 == null) {//GEN-END:|78-getter|0|78-preInit
      // write pre-init user code here
      textField5 = new TextField("N\u00FAmero a buscar:", null, 32, TextField.ANY);//GEN-LINE:|78-getter|1|78-postInit
      // write post-init user code here
    }//GEN-BEGIN:|78-getter|2|
    return textField5;
  }
//</editor-fold>//GEN-END:|78-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem3 ">//GEN-BEGIN:|79-getter|0|79-preInit
  /**
   * Returns an initialized instance of stringItem3 component.
   *
   * @return the initialized component instance
   */
  public StringItem getStringItem3() {
    if (stringItem3 == null) {//GEN-END:|79-getter|0|79-preInit
      // write pre-init user code here
      stringItem3 = new StringItem("Posici\u00F3n del n\u00FAmero:", null);//GEN-LINE:|79-getter|1|79-postInit
      // write post-init user code here
    }//GEN-BEGIN:|79-getter|2|
    return stringItem3;
  }
//</editor-fold>//GEN-END:|79-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|71-getter|0|71-preInit
  /**
   * Returns an initialized instance of okCommand3 component.
   *
   * @return the initialized component instance
   */
  public Command getOkCommand3() {
    if (okCommand3 == null) {//GEN-END:|71-getter|0|71-preInit
      // write pre-init user code here
      okCommand3 = new Command("Ok", Command.OK, 0);//GEN-LINE:|71-getter|1|71-postInit
      // write post-init user code here
    }//GEN-BEGIN:|71-getter|2|
    return okCommand3;
  }
//</editor-fold>//GEN-END:|71-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand3 ">//GEN-BEGIN:|73-getter|0|73-preInit
  /**
   * Returns an initialized instance of exitCommand3 component.
   *
   * @return the initialized component instance
   */
  public Command getExitCommand3() {
    if (exitCommand3 == null) {//GEN-END:|73-getter|0|73-preInit
      // write pre-init user code here
      exitCommand3 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|73-getter|1|73-postInit
      // write post-init user code here
    }//GEN-BEGIN:|73-getter|2|
    return exitCommand3;
  }
//</editor-fold>//GEN-END:|73-getter|2|











  /**
   * Returns a display instance.
   *
   * @return the display instance.
   */
  public Display getDisplay() {
    return Display.getDisplay(this);
  }

  /**
   * Exits MIDlet.
   */
  public void exitMIDlet() {
    switchDisplayable(null, null);
    destroyApp(true);
    notifyDestroyed();
  }

  /**
   * Called when MIDlet is started. Checks whether the MIDlet have been already
   * started and initialize/starts or resumes the MIDlet.
   */
  public void startApp() {
    if (midletPaused) {
      resumeMIDlet();
    } else {
      initialize();
      startMIDlet();
    }
    midletPaused = false;
  }

  /**
   * Called when MIDlet is paused.
   */
  public void pauseApp() {
    midletPaused = true;
  }

  /**
   * Called to signal the MIDlet to terminate.
   *
   * @param unconditional if true, then the MIDlet has to be unconditionally
   * terminated and all resources has to be released.
   */
  public void destroyApp(boolean unconditional) {
  }
}
