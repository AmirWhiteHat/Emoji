/*
 * Copyright (C) 2016 - Niklas Baudy, Ruben Gees, Mario Đanić and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.vanniktech.emoji.googlecompat.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.vanniktech.emoji.googlecompat.GoogleCompatEmoji;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.googlecompat.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class NatureCategory implements EmojiCategory {
  private static final Emoji[] DATA = new Emoji[] {
    new GoogleCompatEmoji(0x1f436),
    new GoogleCompatEmoji(0x1f431),
    new GoogleCompatEmoji(0x1f42d),
    new GoogleCompatEmoji(0x1f439),
    new GoogleCompatEmoji(0x1f430),
    new GoogleCompatEmoji(0x1f98a),
    new GoogleCompatEmoji(0x1f43b),
    new GoogleCompatEmoji(0x1f43c),
    new GoogleCompatEmoji(0x1f428),
    new GoogleCompatEmoji(0x1f42f),
    new GoogleCompatEmoji(0x1f981),
    new GoogleCompatEmoji(0x1f42e),
    new GoogleCompatEmoji(0x1f437),
    new GoogleCompatEmoji(0x1f43d),
    new GoogleCompatEmoji(0x1f438),
    new GoogleCompatEmoji(0x1f435),
    new GoogleCompatEmoji(0x1f648),
    new GoogleCompatEmoji(0x1f649),
    new GoogleCompatEmoji(0x1f64a),
    new GoogleCompatEmoji(0x1f412),
    new GoogleCompatEmoji(0x1f414),
    new GoogleCompatEmoji(0x1f427),
    new GoogleCompatEmoji(0x1f426),
    new GoogleCompatEmoji(0x1f424),
    new GoogleCompatEmoji(0x1f423),
    new GoogleCompatEmoji(0x1f425),
    new GoogleCompatEmoji(0x1f986),
    new GoogleCompatEmoji(0x1f985),
    new GoogleCompatEmoji(0x1f989),
    new GoogleCompatEmoji(0x1f987),
    new GoogleCompatEmoji(0x1f43a),
    new GoogleCompatEmoji(0x1f417),
    new GoogleCompatEmoji(0x1f434),
    new GoogleCompatEmoji(0x1f984),
    new GoogleCompatEmoji(0x1f41d),
    new GoogleCompatEmoji(0x1f41b),
    new GoogleCompatEmoji(0x1f98b),
    new GoogleCompatEmoji(0x1f40c),
    new GoogleCompatEmoji(0x1f41a),
    new GoogleCompatEmoji(0x1f41e),
    new GoogleCompatEmoji(0x1f41c),
    new GoogleCompatEmoji(0x1f577),
    new GoogleCompatEmoji(0x1f578),
    new GoogleCompatEmoji(0x1f422),
    new GoogleCompatEmoji(0x1f40d),
    new GoogleCompatEmoji(0x1f98e),
    new GoogleCompatEmoji(0x1f982),
    new GoogleCompatEmoji(0x1f980),
    new GoogleCompatEmoji(0x1f991),
    new GoogleCompatEmoji(0x1f419),
    new GoogleCompatEmoji(0x1f990),
    new GoogleCompatEmoji(0x1f420),
    new GoogleCompatEmoji(0x1f41f),
    new GoogleCompatEmoji(0x1f421),
    new GoogleCompatEmoji(0x1f42c),
    new GoogleCompatEmoji(0x1f988),
    new GoogleCompatEmoji(0x1f433),
    new GoogleCompatEmoji(0x1f40b),
    new GoogleCompatEmoji(0x1f40a),
    new GoogleCompatEmoji(0x1f406),
    new GoogleCompatEmoji(0x1f405),
    new GoogleCompatEmoji(0x1f403),
    new GoogleCompatEmoji(0x1f402),
    new GoogleCompatEmoji(0x1f404),
    new GoogleCompatEmoji(0x1f98c),
    new GoogleCompatEmoji(0x1f42a),
    new GoogleCompatEmoji(0x1f42b),
    new GoogleCompatEmoji(0x1f418),
    new GoogleCompatEmoji(0x1f98f),
    new GoogleCompatEmoji(0x1f98d),
    new GoogleCompatEmoji(0x1f40e),
    new GoogleCompatEmoji(0x1f416),
    new GoogleCompatEmoji(0x1f410),
    new GoogleCompatEmoji(0x1f40f),
    new GoogleCompatEmoji(0x1f411),
    new GoogleCompatEmoji(0x1f415),
    new GoogleCompatEmoji(0x1f429),
    new GoogleCompatEmoji(0x1f408),
    new GoogleCompatEmoji(0x1f413),
    new GoogleCompatEmoji(0x1f983),
    new GoogleCompatEmoji(0x1f54a),
    new GoogleCompatEmoji(0x1f407),
    new GoogleCompatEmoji(0x1f401),
    new GoogleCompatEmoji(0x1f400),
    new GoogleCompatEmoji(0x1f43f),
    new GoogleCompatEmoji(0x1f43e),
    new GoogleCompatEmoji(0x1f409),
    new GoogleCompatEmoji(0x1f432),
    new GoogleCompatEmoji(0x1f335),
    new GoogleCompatEmoji(0x1f384),
    new GoogleCompatEmoji(0x1f332),
    new GoogleCompatEmoji(0x1f333),
    new GoogleCompatEmoji(0x1f334),
    new GoogleCompatEmoji(0x1f331),
    new GoogleCompatEmoji(0x1f33f),
    new GoogleCompatEmoji(new int[] { 0x2618, 0xfe0f }),
    new GoogleCompatEmoji(0x1f340),
    new GoogleCompatEmoji(0x1f38d),
    new GoogleCompatEmoji(0x1f38b),
    new GoogleCompatEmoji(0x1f343),
    new GoogleCompatEmoji(0x1f342),
    new GoogleCompatEmoji(0x1f341),
    new GoogleCompatEmoji(0x1f344),
    new GoogleCompatEmoji(0x1f33e),
    new GoogleCompatEmoji(0x1f490),
    new GoogleCompatEmoji(0x1f337),
    new GoogleCompatEmoji(0x1f339),
    new GoogleCompatEmoji(0x1f940),
    new GoogleCompatEmoji(0x1f33b),
    new GoogleCompatEmoji(0x1f33c),
    new GoogleCompatEmoji(0x1f338),
    new GoogleCompatEmoji(0x1f33a),
    new GoogleCompatEmoji(0x1f30e),
    new GoogleCompatEmoji(0x1f30d),
    new GoogleCompatEmoji(0x1f30f),
    new GoogleCompatEmoji(0x1f315),
    new GoogleCompatEmoji(0x1f316),
    new GoogleCompatEmoji(0x1f317),
    new GoogleCompatEmoji(0x1f318),
    new GoogleCompatEmoji(0x1f311),
    new GoogleCompatEmoji(0x1f312),
    new GoogleCompatEmoji(0x1f313),
    new GoogleCompatEmoji(0x1f314),
    new GoogleCompatEmoji(0x1f31a),
    new GoogleCompatEmoji(0x1f31d),
    new GoogleCompatEmoji(0x1f31e),
    new GoogleCompatEmoji(0x1f31b),
    new GoogleCompatEmoji(0x1f31c),
    new GoogleCompatEmoji(0x1f319),
    new GoogleCompatEmoji(0x1f4ab),
    new GoogleCompatEmoji(0x2b50),
    new GoogleCompatEmoji(0x1f31f),
    new GoogleCompatEmoji(0x2728),
    new GoogleCompatEmoji(0x26a1),
    new GoogleCompatEmoji(0x1f525),
    new GoogleCompatEmoji(0x1f4a5),
    new GoogleCompatEmoji(new int[] { 0x2604, 0xfe0f }),
    new GoogleCompatEmoji(0x2600),
    new GoogleCompatEmoji(0x1f324),
    new GoogleCompatEmoji(0x26c5),
    new GoogleCompatEmoji(0x1f325),
    new GoogleCompatEmoji(0x1f326),
    new GoogleCompatEmoji(0x1f308),
    new GoogleCompatEmoji(0x2601),
    new GoogleCompatEmoji(0x1f327),
    new GoogleCompatEmoji(new int[] { 0x26c8, 0xfe0f }),
    new GoogleCompatEmoji(0x1f329),
    new GoogleCompatEmoji(0x1f328),
    new GoogleCompatEmoji(new int[] { 0x2603, 0xfe0f }),
    new GoogleCompatEmoji(0x26c4),
    new GoogleCompatEmoji(0x2744),
    new GoogleCompatEmoji(0x1f32c),
    new GoogleCompatEmoji(0x1f4a8),
    new GoogleCompatEmoji(0x1f32a),
    new GoogleCompatEmoji(0x1f32b),
    new GoogleCompatEmoji(0x1f30a),
    new GoogleCompatEmoji(0x1f4a7),
    new GoogleCompatEmoji(0x1f4a6),
    new GoogleCompatEmoji(0x2614),
  };

  @Override @NonNull public Emoji[] getEmojis() {
    return DATA;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_compat_category_nature;
  }

  @Override @StringRes public int getCategoryName() {
    return R.string.emoji_compat_category_nature;
  }
}
