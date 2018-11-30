package br.inf.edge.suporte.visita.features.cliente;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import br.inf.edge.suporte.visita.MapsActivity;
import br.inf.edge.suporte.visita.R;
import br.inf.edge.suporte.visita.features.visita.VisitaActivity;

class ClienteViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    RelativeLayout itemCliente;

    TextView labelCliente;
    TextView labelObservacao;
    TextView labelBotao;


    Integer codigoCliente;
    String tipoBotao;
    Integer codigoRegiao;

    public ClienteViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        itemCliente = itemView.findViewById(R.id.item_cliente);

        labelCliente = itemView.findViewById(R.id.label_cliente);
        labelObservacao = itemView.findViewById(R.id.label_observacao);
        labelBotao = itemView.findViewById(R.id.label_botao);
    }

    @Override
    public void onClick(View view) {

        if (tipoBotao != null) {

            if ( "mapa".equals(tipoBotao) ) {

                EventBus.getDefault().postSticky(codigoRegiao);

                Intent intent = new Intent(view.getContext(), MapsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                view.getContext().startActivity(intent);
            }

        } else {
            EventBus.getDefault().postSticky(codigoCliente);

            Intent intent = new Intent(view.getContext(), VisitaActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            view.getContext().startActivity(intent);
        }
    }
}
