package nessiesson.newlight;

import com.mumfrey.liteloader.Tickable;
import net.minecraft.client.Minecraft;

import java.io.File;

public class LiteModNewLight implements Tickable {

	@Override
	public void onTick(Minecraft minecraft, float partialTicks, boolean inGame, boolean clock) {
	}

	@Override
	public String getVersion() {
		return "@VERSION@";
	}

	@Override
	public void init(File configPath) {
	}

	@Override
	public void upgradeSettings(String version, File configPath, File oldConfigPath) {
	}

	@Override
	public String getName() {
		return "@NAME@";
	}
}