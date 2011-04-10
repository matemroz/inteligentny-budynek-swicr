package View.client;

import com.smartgwt.client.widgets.Dialog;
import com.google.gwt.user.client.ui.Label;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.HTMLPane;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.events.CloseClientEvent;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.DateItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class ProjektowanieDialog extends Dialog {

	public ProjektowanieDialog() {
		final Window winModal = new Window();
		winModal.setWidth(545);
		winModal.setHeight(406);
		winModal.setTitle("Projektowanie budynku");
		winModal.setShowMinimizeButton(false);
		winModal.setIsModal(true);
		winModal.setShowModalMask(true);

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("531px", "355px");
		winModal.addItem(absolutePanel);

		Label lblListaPokoi = new Label("Lista pokoi:");
		absolutePanel.add(lblListaPokoi, 10, 38);
		lblListaPokoi.setSize("113px", "14px");

		ListBox listBox = new ListBox();
		absolutePanel.add(listBox, 10, 58);
		listBox.setSize("149px", "264px");
		listBox.setVisibleItemCount(10);

		Label lblNazwa = new Label("Nazwa");
		absolutePanel.add(lblNazwa, 204, 58);

		TextBox textBox = new TextBox();
		absolutePanel.add(textBox, 248, 50);
		textBox.setSize("214px", "16px");

		Button button = new Button("New button");
		button.setText("Dodaj nowy");
		absolutePanel.add(button, 199, 88);
		button.setSize("100px", "24px");

		Button button_1 = new Button("New button");
		button_1.setText("Zmie\u0144 nazw\u0119");
		absolutePanel.add(button_1, 199, 118);
		button_1.setSize("130px", "24px");

		Button button_2 = new Button("New button");
		button_2.setText("Usu\u0144");
		absolutePanel.add(button_2, 199, 148);
		button_2.setSize("100px", "24px");

		Button button_3 = new Button("New button");
		button_3.setText("Od\u015Bwie\u017C list\u0119");
		absolutePanel.add(button_3, 10, 328);
		button_3.setSize("136px", "24px");
		winModal.centerInPage();
		winModal.addCloseClickHandler(new CloseClickHandler() {
			public void onCloseClick(CloseClientEvent event) {
				winModal.destroy();
			}
		});
		winModal.show();
	}
}
