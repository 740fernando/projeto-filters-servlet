package filter;

import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

//Foi definido o mapeamento *, qualquer url acessada, passara por esse filter.
@WebFilter("/*")
public class TimeFilter implements Filter { //responsável pela medição -> tempo de resposta - recebe a requisicao e passa para frente(outro filter, ou um servlet), recebe a resposta de volta e depois devolve.

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		long inicio = System.currentTimeMillis();// armezena a data e hora inicial do sistema
		
		chain.doFilter(request, response); // Passa requisicao para o servlet
		
		long fim = System.currentTimeMillis(); 
		
		long time = fim - inicio;
		
		//armazena o resultado no log
		FileWriter fw = new FileWriter("C:/ws-ee/Filter/time.txt",true); // o valor true indica que o arquivo será aberto no modo append. Toda vez que eu abrir o arquvio, se ele tive conteudo, eu irei escrever a partir do final, se eu nao abrir no modo de append, sempre que eu for escrever o arquivo, sobrecreverei o conteudo . 		
		fw.write("URI: "+req.getRequestURI()+":"+time+"ms");
		fw.write(System.getProperty("line.separator"));
		fw.close();
	}


	public void init(FilterConfig fConfig) throws ServletException {
	}
	
	public void destroy() {
	}

}
/*
 * O filter é unico para aplicacao inteira
 * 
 * doFilter Responsavel pela logica de execucao.
 * 
 * System.currentTimeMillis() - retorna a data e hora atual do sistema
 * 
 * NÃO É NECESSARIO O SERVLET, VC TEM DOIS COMPONENTES QUE TRABALHAM JUNTOS, MAS EM NENHUM MOMENTO UM REFERENCIA O OUTRO
 * 
 * UM SISTEMA DESACOPLADO!!!!
 */
