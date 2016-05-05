using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(AntiDrugWeb1.Startup))]
namespace AntiDrugWeb1
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
