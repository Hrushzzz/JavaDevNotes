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
        if (platform.equals(SupportedPlatforms.WINDOWS)) {
            return new WindowsFactory();
        } else if (platform.equals(SupportedPlatforms.IOS)) {
            return new IOSFactory();
        } else {
            return new AndroidFactory();
        }
    }
}
