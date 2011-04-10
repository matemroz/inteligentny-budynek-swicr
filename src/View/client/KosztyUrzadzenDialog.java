package View.client;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.smartgwt.client.widgets.Dialog;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.events.CloseClientEvent;

public class KosztyUrzadzenDialog extends Dialog {

	public KosztyUrzadzenDialog() {
		final Window winModal = new Window();
		winModal.setWidth(545);
		winModal.setHeight(406);
		winModal.setTitle("Koszty pracy urz\u0105dze\u0144");
		winModal.setShowMinimizeButton(false);
		winModal.setIsModal(true);
		winModal.setShowModalMask(true);

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("531px", "355px");
		winModal.addItem(absolutePanel);
		
		Label lblListaUrzdze = new Label("Lista urz\u0105dze\u0144:");
		absolutePanel.add(lblListaUrzdze, 10, 10);
		lblListaUrzdze.setSize("101px", "14px");
		
		ListBox listBox = new ListBox();
		absolutePanel.add(listBox, 10, 30);
		listBox.setSize("135px", "285px");
		listBox.setVisibleItemCount(5);
		
		Button button = new Button("New button");
		button.setText("Od\u015Bwie\u017C list\u0119");
		absolutePanel.add(button, 10, 321);
		button.setSize("135px", "24px");
		
		Label lblStatystykaUrzdzenia = new Label("Statystyka urz\u0105dzenia:");
		absolutePanel.add(lblStatystykaUrzdzenia, 200, 30);
		
		Label lblCzasPracy = new Label("\u0141\u0105czny czas pracy: ");
		absolutePanel.add(lblCzasPracy, 200, 50);
		
		Label lblcznyKoszt = new Label("\u0141\u0105czny koszt:");
		absolutePanel.add(lblcznyKoszt, 200, 70);
		
		Label label = new Label("New label");
		absolutePanel.add(label, 308, 48);
		
		Label label_1 = new Label("New label");
		absolutePanel.add(label_1, 308, 68);
		
		Label lblStatystkiSumaryczne = new Label("Statystki sumaryczne wszystkich urz\u0105dze\u0144:");
		absolutePanel.add(lblStatystkiSumaryczne, 200, 145);
		
		Label lblcznyCzasPracy = new Label("\u0141\u0105czny czas pracy: ");
		absolutePanel.add(lblcznyCzasPracy, 200, 167);
		
		Label lblcznyKoszt_1 = new Label("\u0141\u0105czny koszt:");
		absolutePanel.add(lblcznyKoszt_1, 200, 187);
		
		Label label_2 = new Label("New label");
		absolutePanel.add(label_2, 308, 165);
		
		Label label_3 = new Label("New label");
		absolutePanel.add(label_3, 308, 187);


		winModal.centerInPage();
		winModal.addCloseClickHandler(new CloseClickHandler() {
			public void onCloseClick(CloseClientEvent event) {
				winModal.destroy();
			}
		});
		winModal.show();
		}
}
