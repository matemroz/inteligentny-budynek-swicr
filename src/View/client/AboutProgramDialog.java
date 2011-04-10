package View.client;

import com.smartgwt.client.widgets.Dialog;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.events.CloseClientEvent;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;

public class AboutProgramDialog extends Dialog {

	public AboutProgramDialog() {
		final Window winModal = new Window();
		winModal.setWidth(545);
		winModal.setHeight(406);
		winModal.setTitle("Informacje o programie");
		winModal.setShowMinimizeButton(false);
		winModal.setIsModal(true);
		winModal.setShowModalMask(true);

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setSize("531px", "355px");
		winModal.addItem(absolutePanel);
		
		Label lblProgramZostaUtworzony = new Label("Program zosta\u0142 utworzony w ramach przedmiotu systemy wbudowane czasu rzeczywistego.  ");
		absolutePanel.add(lblProgramZostaUtworzony, 27, 30);
		lblProgramZostaUtworzony.setSize("460px", "27px");
		
		Label lblProgramStanowiPanel = new Label("Program stanowi panel do zarz\u0105dzania inteligentnym budynkiem. Jego funkcje to:");
		absolutePanel.add(lblProgramStanowiPanel, 27, 73);
		
		Label lblProjektowanieBudynku = new Label("- planowanie oraz zarz\u0105dzanie prac\u0105 urz\u0105dze\u0144,");
		absolutePanel.add(lblProjektowanieBudynku, 29, 93);
		
		Label lblProjektowanieBudynku_1 = new Label("- projektowanie budynku (zarz\u0105dzanie pokojami w budynku),");
		absolutePanel.add(lblProjektowanieBudynku_1, 29, 113);
		
		Label lblKalkulacjaKosztw = new Label("- kalkulacja koszt\u00F3w zu\u017Cycia energii elektrycznej i gazu przez urz\u0105dzenia.");
		absolutePanel.add(lblKalkulacjaKosztw, 29, 134);
		
		Label lblDoRealizacjiProgramu = new Label("Do realizacji programu wykorzystano:");
		absolutePanel.add(lblDoRealizacjiProgramu, 27, 188);
		
		Label lblFrameworkSmart = new Label("- framework Smart GWT (http://code.google.com/p/smartgwt/),");
		absolutePanel.add(lblFrameworkSmart, 27, 208);
		
		Label lblBazDanych = new Label("- baz\u0119 danych Microsoft SQL Server 2005.");
		absolutePanel.add(lblBazDanych, 27, 228);


		winModal.centerInPage();
		winModal.addCloseClickHandler(new CloseClickHandler() {
			public void onCloseClick(CloseClientEvent event) {
				winModal.destroy();
			}
		});
		winModal.show();
	}
}
