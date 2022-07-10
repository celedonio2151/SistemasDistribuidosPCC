using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace ServiceWebBanco
{
    /// <summary>
    /// Descripción breve de SerWebBanco
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class SerWebBanco : System.Web.Services.WebService
    {

        [WebMethod]
        public string HelloWorld()
        {
            return "Hola a todos";
        }


        [WebMethod]
        public string obtenerCotizaciones(string moneda ) // Recibe US o EU
        {
            if(moneda == "US")
            {
                return "6.96";
            }
            else if(moneda == "EU")
            {
                return "8.5";
            }
            return null;
        }
    }
}
