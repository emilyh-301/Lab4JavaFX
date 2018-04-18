package app.hub;

import java.io.IOException;

import netgame.common.Hub;
import pkgCore.GamePlay;
import pkgCore.GamePlayBlackJack;
import pkgCore.Table;
import pkgEnum.eGameType;

public class GameHub extends Hub {

	private Table hubTable;
	private GamePlay hubGamePlay;
	
	public GameHub(int port) throws IOException {
		super(port);
	}

	@Override
	protected void messageReceived(int playerID, Object message) {
		// TODO Auto-generated method stub
		super.messageReceived(playerID, message);
		
		hubGamePlay = new GamePlayBlackJack(eGameType.BLACKJACK);
	}
	
}
