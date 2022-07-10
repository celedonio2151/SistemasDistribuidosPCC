using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace ServiceWebImpuestos
{
    /// <summary>
    /// Descripción breve de SerWebImpuestos
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class SerWebImpuestos : System.Web.Services.WebService
    {
        Factura factura = new Factura();

        [WebMethod]
        public string sincronizarFechaHora()
        {
            return DateTime.Now.ToString();
        }

        [WebMethod]
        public string obtenerCufd(int idambiente, string modalidad, string NIT)
        {
            return "AB0000345C3421";
        }

        [WebMethod]
        public string emitirFactura(int idambiente, int Nit, int modalidad, Factura factura)
        {
            return "Estado=valido : mensaje=recibido correctamente";
        }
    }
}
