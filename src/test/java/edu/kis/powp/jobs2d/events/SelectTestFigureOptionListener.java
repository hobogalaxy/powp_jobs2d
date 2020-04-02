package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
			case "Figure Joe 1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "Figure Jane 1":
				FiguresJoe.figureScript1(new DriverAdapter(driverManager.getCurrentDriver()));
				break;

		}
	}
}
