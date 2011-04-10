package View.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.InlineHTML;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.MenuItemSeparator;
import com.smartgwt.client.util.BooleanCallback;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

public class InteligentnyBudynek extends HLayout implements EntryPoint {

	public void onModuleLoad() {

		SC.ask("Czy za\u0142adowa\u0107 projekt z przyk\u0142adowymi danymi?",
				new BooleanCallback() {
					public void execute(Boolean value) {
						if (value != null && value) {
							;
						} else {
							;
						}
					}
				});

		RootPanel rootPanel = RootPanel.get();
		rootPanel.setSize("1000", "600");

		DockPanel dockPanel = new DockPanel();
		rootPanel.add(dockPanel, 0, 0);
		dockPanel.setSize("1000px", "28px");

		com.google.gwt.user.client.ui.Label lblPanelZarzdzaniaInteligentnym = new com.google.gwt.user.client.ui.Label(
				"Inteligentny budynek v1.0");
		lblPanelZarzdzaniaInteligentnym.setStyleName("gwt-Label-header");
		lblPanelZarzdzaniaInteligentnym
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		lblPanelZarzdzaniaInteligentnym.setSize("1000px", "30px");
		dockPanel.add(lblPanelZarzdzaniaInteligentnym, DockPanel.WEST);

		MenuBar menuBar = new MenuBar(false);
		rootPanel.add(menuBar, 0, 29);
		menuBar.setSize("1000px", "22px");
		menuBar.setStyleName("gwt-MenuBar");
		MenuBar menuBar_1 = new MenuBar(true);

		MenuItem mntmPlik = new MenuItem("Plik", false, menuBar_1);
		mntmPlik.setWidth("60");

		MenuItem mntmNowy = new MenuItem("Nowy", false, (Command) null);

		menuBar_1.addItem(mntmNowy);
		mntmNowy.setSize("70", "20");

		MenuItem mntmZapisz = new MenuItem("Zapisz", false, new Command() {
			public void execute() {
			}
		});
		menuBar_1.addItem(mntmZapisz);

		menuBar.addItem(mntmPlik);
		mntmPlik.setSize("25", "16");

		MenuItemSeparator separator = new MenuItemSeparator();
		menuBar.addSeparator(separator);
		MenuBar menuBar_2 = new MenuBar(true);

		MenuItem mntmNarzdzia = new MenuItem("Narz\u0119dzia", false, menuBar_2);
		mntmNarzdzia.setWidth("62");
		MenuItem mntmProjektuj = new MenuItem("Projektuj", false,
				new Command() {
					public void execute() {
						new ProjektowanieDialog();
					}
				});
		menuBar_2.addItem(mntmProjektuj);
		mntmProjektuj.setSize("62", "16");

		MenuItem mntmPlanuj = new MenuItem("Planuj", false, new Command() {
			public void execute() {
				new PlanowanieDialog();
			}
		});
		menuBar_2.addItem(mntmPlanuj);
		menuBar.addItem(mntmNarzdzia);
		mntmNarzdzia.setSize("63", "16");

		MenuItemSeparator separator_1 = new MenuItemSeparator();
		menuBar.addSeparator(separator_1);
		MenuBar menuBar_3 = new MenuBar(true);

		MenuItem mntmStatystyka = new MenuItem("Statystyka", false, menuBar_3);

		MenuItem mntmKosztorys = new MenuItem("Koszt pracy urz\u0105dze\u0144",
				false, new Command() {
					public void execute() {
						new KosztyUrzadzenDialog();
					}
				});
		menuBar_3.addItem(mntmKosztorys);
		menuBar.addItem(mntmStatystyka);
		mntmStatystyka.setSize("62", "16");

		MenuItemSeparator separator_2 = new MenuItemSeparator();
		menuBar.addSeparator(separator_2);
		MenuBar menuBar_4 = new MenuBar(true);

		MenuItem mntmHelp = new MenuItem("Help", false, menuBar_4);

		MenuItem mntmAutorzy = new MenuItem("Autorzy", false, new Command() {
			public void execute() {
				new AutorzyDialog();
			}
		});
		menuBar_4.addItem(mntmAutorzy);

		MenuItem mntmOProgramie = new MenuItem("O programie", false, new Command() {
			public void execute() {
				new AboutProgramDialog();
			}
		});
		menuBar_4.addItem(mntmOProgramie);
		menuBar.addItem(mntmHelp);

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setStyleName("mainPanel");
		rootPanel.add(absolutePanel, 0, 53);
		absolutePanel.setSize("1000px", "550px");
	}
}