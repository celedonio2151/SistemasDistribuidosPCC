namespace ClienteSOAP
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            string modena = texM1.Text;
            string nit1 = texN1.Text;
            string idAm = texA1.Text;
            string moda1 = texMd1.Text;

            // ------------------------------
            string idAm2 = texAm2.Text;
            string nit2 = texN2.Text;
            string moda2 = texM2.Text;
            string can2 = texCan2.Text;
            string prod2 = texPro2.Text;
            string prec2 = texPre2.Text;
            string preTo = texPreT2.Text;

            ServiceBanco.SerWebBancoSoapClient clienteBanco = new ServiceBanco.SerWebBancoSoapClient();
            ServiceImpuestos.SerWebImpuestosSoapClient clienteImpuesto = new ServiceImpuestos.SerWebImpuestosSoapClient();

            clienteBanco.obtenerCotizacionesAsync(modena);
            clienteImpuesto.sincronizarFechaHoraAsync();
            clienteImpuesto.obtenerCufdAsync(int.Parse(idAm), moda1, nit1);

        }
    }
}