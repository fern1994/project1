using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(AntiDrugWeb2.Startup))]
namespace AntiDrugWeb2
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
