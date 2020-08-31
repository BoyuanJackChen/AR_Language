package com.example.loadduringrun;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.google.ar.core.Anchor;
import com.google.ar.sceneform.assets.RenderableSource;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;

public class MainActivity extends AppCompatActivity {

    private ArFragment arFragment;
    private String ASSET_3D = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);

        arFragment.setOnTapArPlaneListener(((hitResult, plane, motionEvent) -> {
            placeModel(hitResult.createAnchor());
        });
    }

    private void placeModel(Anchor anchor) {
        ModelRenderable
                .builder()
                .setSource(
                        this,
                        RenderableSource
                            .builder()
                            .setSource(this, Uri.parse(ASSET_3D), RenderableSource.SourceType.GLTF2)
                            .setScale(0.75f)
                            .setRecenterMode(RenderableSource.RecenterMode.ROOT)
                            .build()
                )
                .setRegistryId(ASSET_3D)
                .build()
                .thenAccept(modelRenderable -> addNoteToScene(modelRenderable, anchor))
                .exceptionally(throwable -> {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(throwable.getMessage()).show();
                    return null;
                })
    }

    private void addNoteToScene(ModelRenderable modelRenderable, Anchor anchor) {
        
    }

}
