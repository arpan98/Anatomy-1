/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.anatomy.AnatomySkeleton.component;

import org.terasology.anatomy.component.PartEffectOutcome;
import org.terasology.anatomy.component.PartSkeletalDetails;
import org.terasology.entitySystem.Component;
import org.terasology.network.Replicate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A component that allows an entity to have bones in their anatomy.
 */
public class BoneComponent implements Component {
    /**
     * Maps Anatomy parts to its details.
     */
    @Replicate
    public Map<String, PartSkeletalDetails> parts = new HashMap<>();

    @Replicate
    public Map<String, List<PartEffectOutcome>> partEffectOutcomes = new HashMap<>();
}
