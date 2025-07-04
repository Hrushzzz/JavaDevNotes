package DesignPatterns.Factory;

public class Flutter {

    private SupportedPlatforms platform;

    // constructor::
    public Flutter(SupportedPlatforms platform) {
        this.platform = platform;
    }

    public void setTheme(){

    }

    public void setSounds() {

    }

    public UIFactory uiFactory() {
        return UIFactoryFactory.getUIFactory(platform);
    }
}
