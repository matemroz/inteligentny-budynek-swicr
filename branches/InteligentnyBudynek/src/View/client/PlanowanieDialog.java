package View.client;

import com.smartgwt.client.widgets.Dialog;
import com.smartgwt.client.widgets.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.smartgwt.client.widgets.DateChooser;
import com.smartgwt.client.widgets.form.DynamicForm;  
import com.smartgwt.client.widgets.form.fields.DateItem;  
import com.smartgwt.client.widgets.form.fields.TextItem;  
import com.smartgwt.client.types.VerticalAlignment;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;  
import com.smartgwt.client.widgets.events.CloseClickHandler;  
import com.smartgwt.client.widgets.events.CloseClientEvent;  

public class PlanowanieDialog extends Dialog {

	public PlanowanieDialog() {
		utworz();
	}
	
	public void utworz(){
        final Window winModal = new Window();  
        winModal.setWidth(791);  
        winModal.setHeight(379);  
        winModal.setTitle("Planowanie dzia\u0142ania urz\u0105dze\u0144");  
        winModal.setShowMinimizeButton(false);  
        winModal.setIsModal(true);  
        winModal.setShowModalMask(true);  
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("755px", "322px");
		winModal.addItem(absolutePanel);
		
		Label lblListaUrzdze = new Label("Lista urz\u0105dze\u0144:");
		absolutePanel.add(lblListaUrzdze, 10, 17);
		lblListaUrzdze.setSize("109px", "14px");
		
		ListBox listBox = new ListBox();
		absolutePanel.add(listBox, 10, 37);
		listBox.setSize("120px", "249px");
		listBox.setVisibleItemCount(10);
		
		Button button = new Button("New button");
		button.setText("Od\u015Bwie\u017C list\u0119");
		absolutePanel.add(button, 10, 292);
		button.setSize("128px", "24px");
		
		Button button_1 = new Button("New button");
		button_1.setText("W\u0142\u0105cz");
		absolutePanel.add(button_1, 153, 37);
		button_1.setSize("100px", "24px");
		
		Button button_2 = new Button("New button");
		button_2.setText("Wy\u0142\u0105cz");
		absolutePanel.add(button_2, 269, 37);
		button_2.setSize("100px", "24px");
		
		Label lblZaplanujDziaanie = new Label("Zaplanuj dzia\u0142anie");
		absolutePanel.add(lblZaplanujDziaanie, 153, 175);
		lblZaplanujDziaanie.setSize("109px", "14px");
		
        DynamicForm form = new DynamicForm();  
        form.setSize("292px", "52px");
        form.setHeight100();  
        form.setWidth100();  
        form.setPadding(5);  
        form.setLayoutAlign(VerticalAlignment.BOTTOM);  
        DateItem dateItem = new DateItem();  
        dateItem.setTooltip("Wybierz_dat\u0119_w\u0142\u0105czenia_urz\u0105dzenia\r\n");
        dateItem.setDisabled(false);
        dateItem.setTitle("Data w\u0142\u0105czenia");
        DateItem dateItem_1 = new DateItem();
        dateItem_1.setTooltip("Wybierz_dat\u0119_wy\u0142\u0105czenia_urz\u0105dzenia");
        dateItem_1.setDisabled(false);
        dateItem_1.setTitle("Data wy\u0142\u0105czenia");
        
        form.setFields(dateItem, dateItem_1);  

        absolutePanel.add(form, 136, 195);
        
        Label lblGodzina = new Label("Godzina: ");
        absolutePanel.add(lblGodzina, 439, 203);
        
        Label label = new Label("Godzina: ");
        absolutePanel.add(label, 439, 230);
        label.setSize("43px", "14px");
        
        TextBox textBox = new TextBox();
        absolutePanel.add(textBox, 488, 203);
        
        Label lblhhmmss = new Label("(HH:MM:SS)");
        absolutePanel.add(lblhhmmss, 641, 200);
        
        Label label_1 = new Label("(HH:MM:SS)");
        absolutePanel.add(label_1, 642, 230);
        label_1.setSize("58px", "14px");
        
        TextBox textBox_1 = new TextBox();
        absolutePanel.add(textBox_1, 488, 230);
        textBox_1.setSize("141px", "18px");
        
        Label lblParametryUrzdzenia = new Label("Parametry urz\u0105dzenia");
        absolutePanel.add(lblParametryUrzdzenia, 153, 81);
        
        Label lblMoc = new Label("Moc: ");
        absolutePanel.add(lblMoc, 153, 101);
        
        Button button_3 = new Button("New button");
        button_3.setText("Dodaj");
        absolutePanel.add(button_3, 387, 262);
        button_3.setSize("100px", "24px");
        
        Button button_4 = new Button("New button");
        button_4.setText("Edytuj");
        absolutePanel.add(button_4, 498, 262);
        button_4.setSize("100px", "24px");
        
        Button button_5 = new Button("New button");
        button_5.setText("Usu\u0144");
        absolutePanel.add(button_5, 612, 263);
        button_5.setSize("100px", "24px");
        
        TextBox textBox_2 = new TextBox();
        absolutePanel.add(textBox_2, 223, 101);
        textBox_2.setSize("60px", "16px");
        
        Button button_6 = new Button("New button");
        button_6.setText("Ustaw");
        absolutePanel.add(button_6, 387, 101);
        button_6.setSize("100px", "24px");
        
        Label lblW = new Label("W");
        absolutePanel.add(lblW, 295, 101);
        
        Label lblPobrGazu = new Label("Pob\u00F3r gazu:");
        absolutePanel.add(lblPobrGazu, 153, 129);
        
        TextBox textBox_3 = new TextBox();
        absolutePanel.add(textBox_3, 223, 129);
        textBox_3.setSize("60px", "16px");
        
        Label lblM = new Label("m3");
        absolutePanel.add(lblM, 295, 127);
        
        Button button_7 = new Button("New button");
        button_7.setText("Ustaw");
        absolutePanel.add(button_7, 387, 127);
        button_7.setSize("100px", "24px");
        
        winModal.centerInPage();  
        winModal.addCloseClickHandler(new CloseClickHandler() {  
            public void onCloseClick(CloseClientEvent event) {  
                winModal.destroy();  
            }  
        });
        winModal.show();  
	}
}
