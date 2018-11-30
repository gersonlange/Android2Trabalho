package br.inf.edge.suporte.visita.features.regiao;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import br.inf.edge.suporte.visita.R;
import br.inf.edge.suporte.visita.features.cliente.ClienteActivity;

class RegiaoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    RelativeLayout itemRegiao;

    TextView labelRegiao;
    TextView labelObservacao;
    TextView labelCodigo;
    TextView labelData;
    TextView labelBotao;

    Integer codigoRegiao;
    String tipoBotao;

    public RegiaoViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        itemRegiao = itemView.findViewById(R.id.item_regiao);

        labelRegiao = itemView.findViewById(R.id.label_regiao);
        labelData = itemView.findViewById(R.id.label_data);
        labelObservacao = itemView.findViewById(R.id.label_observacao);
        labelCodigo = itemView.findViewById(R.id.label_codigo);
        labelBotao = itemView.findViewById(R.id.label_botao);
    }

    @Override
    public void onClick(View view) {

        if (tipoBotao != null) {

            if ( "mapa".equals(tipoBotao) ) {
                Intent intent = new Intent(view.getContext(), MapaActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                view.getContext().startActivity(intent);
            }

        } else {
            EventBus.getDefault().postSticky(codigoRegiao);

            Intent intent = new Intent(view.getContext(), ClienteActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            view.getContext().startActivity(intent);
        }
    }
}
