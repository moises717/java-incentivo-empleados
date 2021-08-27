package empleadosGUI;

import org.greenrobot.eventbus.EventBus;

public class Principal {

    public static EventBus eventos = new EventBus();

    public static void main(String[] args) {
        FrmEmpleados frmEmp = new FrmEmpleados();
        frmEmp.setVisible(true);
        
        eventos.register(frmEmp);
    }

}
