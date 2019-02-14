using Avalonia;
using Avalonia.Markup.Xaml;

namespace KallistoGUI
{
    public class App : Application
    {
        public override void Initialize()
        {
            AvaloniaXamlLoader.Load(this);
        }
    }
}
