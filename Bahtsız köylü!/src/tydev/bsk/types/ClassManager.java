package tydev.bsk.types;

public class ClassManager {

	private static ClasS lightMeleeAdv;
	private static ClasS farmer;

	public ClassManager() {

		farmer = new Farmer();
		lightMeleeAdv = new LightMeleeAdv();

	}

	public ClasS getFarmer() {
		return farmer;
	}

	public void setFarmer(ClasS farmer) {
		this.farmer = farmer;
	}

	public ClasS getLightMeleeAdv() {
		return lightMeleeAdv;
	}

	public void setLightMeleeAdv(ClasS lightMeleeAdv) {
		this.lightMeleeAdv = lightMeleeAdv;
	}

}
