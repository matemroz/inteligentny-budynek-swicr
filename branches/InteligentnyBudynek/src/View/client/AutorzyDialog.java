package View.client;

import com.smartgwt.client.widgets.Dialog;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.events.CloseClientEvent;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Image;

public class AutorzyDialog extends Dialog {

	public AutorzyDialog() {
		final Window winModal = new Window();
		winModal.setWidth(545);
		winModal.setHeight(406);
		winModal.setTitle("Autorzy programu");
		winModal.setShowMinimizeButton(false);
		winModal.setIsModal(true);
		winModal.setShowModalMask(true);

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("531px", "355px");
		winModal.addItem(absolutePanel);
		
		Label lblAutorzyProgramu = new Label("Autorzy programu:");
		lblAutorzyProgramu.setStyleName("gwt-Label-title");
		absolutePanel.add(lblAutorzyProgramu, 29, 57);
		lblAutorzyProgramu.setSize("186px", "23px");
		
		Label lblGrzegorzBieniek = new Label("Grzegorz Bieniek");
		absolutePanel.add(lblGrzegorzBieniek, 29, 86);
		
		Label lblMichaBanasik = new Label("Micha\u0142 Banasik");
		absolutePanel.add(lblMichaBanasik, 29, 106);
		
		Label lblRafawistowski = new Label("Rafa\u0142 \u015Awistowski");
		absolutePanel.add(lblRafawistowski, 29, 126);
		
		Label lblMateuszMrz = new Label("Mateusz Mr\u00F3z");
		absolutePanel.add(lblMateuszMrz, 29, 144);
		
		Label lblWszyscySStudentami = new Label("Wszyscy autorzy s\u0105 studentami inforamtyki na wydziale elektrycznym Politechniki Warszawskiej.");
		absolutePanel.add(lblWszyscySStudentami, 29, 187);
		lblWszyscySStudentami.setSize("282px", "31px");
		
		Label lblPolitechnikaWarszawska = new Label("Politechnika Warszawska 2011");
		absolutePanel.add(lblPolitechnikaWarszawska, 183, 304);
		lblPolitechnikaWarszawska.setSize("198px", "41px");


		winModal.centerInPage();
		winModal.addCloseClickHandler(new CloseClickHandler() {
			public void onCloseClick(CloseClientEvent event) {
				winModal.destroy();
			}
		});
		winModal.show();
	}
}
