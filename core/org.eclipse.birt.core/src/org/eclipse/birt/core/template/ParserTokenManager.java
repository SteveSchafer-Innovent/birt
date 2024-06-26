/*******************************************************************************
 * Copyright (c) 2021 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   See git history
 *******************************************************************************/
/* Generated By:JJTree&JavaCC: Do not edit this line. ParserTokenManager.java */
package org.eclipse.birt.core.template;

/** Token Manager. */
public class ParserTokenManager implements ParserConstants {

	/** Debug output. */
	public java.io.PrintStream debugStream = System.out;

	/** Set debug output. */
	public void setDebugStream(java.io.PrintStream ds) {
		debugStream = ds;
	}

	private int jjStopAtPos(int pos, int kind) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		return pos + 1;
	}

	private int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
		case 60:
			return jjMoveStringLiteralDfa1_0(0xfcL);
		default:
			return jjMoveNfa_0(2, 0);
		}
	}

	private int jjMoveStringLiteralDfa1_0(long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 0);
		}
		switch (curChar) {
		case 47:
			return jjMoveStringLiteralDfa2_0(active0, 0xa8L);
		case 73:
			return jjMoveStringLiteralDfa2_0(active0, 0x40L);
		case 86:
			return jjMoveStringLiteralDfa2_0(active0, 0x14L);
		case 105:
			return jjMoveStringLiteralDfa2_0(active0, 0x40L);
		case 118:
			return jjMoveStringLiteralDfa2_0(active0, 0x14L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 1);
	}

	private int jjMoveStringLiteralDfa2_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 1);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 1);
		}
		switch (curChar) {
		case 65:
			return jjMoveStringLiteralDfa3_0(active0, 0x4L);
		case 73:
			return jjMoveStringLiteralDfa3_0(active0, 0x90L);
		case 77:
			return jjMoveStringLiteralDfa3_0(active0, 0x40L);
		case 86:
			return jjMoveStringLiteralDfa3_0(active0, 0x28L);
		case 97:
			return jjMoveStringLiteralDfa3_0(active0, 0x4L);
		case 105:
			return jjMoveStringLiteralDfa3_0(active0, 0x90L);
		case 109:
			return jjMoveStringLiteralDfa3_0(active0, 0x40L);
		case 118:
			return jjMoveStringLiteralDfa3_0(active0, 0x28L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 2);
	}

	private int jjMoveStringLiteralDfa3_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 2);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 2);
		}
		switch (curChar) {
		case 65:
			return jjMoveStringLiteralDfa4_0(active0, 0x48L);
		case 69:
			return jjMoveStringLiteralDfa4_0(active0, 0x10L);
		case 73:
			return jjMoveStringLiteralDfa4_0(active0, 0x20L);
		case 76:
			return jjMoveStringLiteralDfa4_0(active0, 0x4L);
		case 77:
			return jjMoveStringLiteralDfa4_0(active0, 0x80L);
		case 97:
			return jjMoveStringLiteralDfa4_0(active0, 0x48L);
		case 101:
			return jjMoveStringLiteralDfa4_0(active0, 0x10L);
		case 105:
			return jjMoveStringLiteralDfa4_0(active0, 0x20L);
		case 108:
			return jjMoveStringLiteralDfa4_0(active0, 0x4L);
		case 109:
			return jjMoveStringLiteralDfa4_0(active0, 0x80L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 3);
	}

	private int jjMoveStringLiteralDfa4_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 3);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 3);
		}
		switch (curChar) {
		case 65:
			return jjMoveStringLiteralDfa5_0(active0, 0x80L);
		case 69:
			return jjMoveStringLiteralDfa5_0(active0, 0x20L);
		case 71:
			return jjMoveStringLiteralDfa5_0(active0, 0x40L);
		case 76:
			return jjMoveStringLiteralDfa5_0(active0, 0x8L);
		case 85:
			return jjMoveStringLiteralDfa5_0(active0, 0x4L);
		case 87:
			return jjMoveStringLiteralDfa5_0(active0, 0x10L);
		case 97:
			return jjMoveStringLiteralDfa5_0(active0, 0x80L);
		case 101:
			return jjMoveStringLiteralDfa5_0(active0, 0x20L);
		case 103:
			return jjMoveStringLiteralDfa5_0(active0, 0x40L);
		case 108:
			return jjMoveStringLiteralDfa5_0(active0, 0x8L);
		case 117:
			return jjMoveStringLiteralDfa5_0(active0, 0x4L);
		case 119:
			return jjMoveStringLiteralDfa5_0(active0, 0x10L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 4);
	}

	private int jjMoveStringLiteralDfa5_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 4);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 4);
		}
		switch (curChar) {
		case 69:
			if ((active0 & 0x40L) != 0L) {
				jjmatchedKind = 6;
				jjmatchedPos = 5;
			}
			return jjMoveStringLiteralDfa6_0(active0, 0x4L);
		case 71:
			return jjMoveStringLiteralDfa6_0(active0, 0x80L);
		case 84:
			return jjMoveStringLiteralDfa6_0(active0, 0x10L);
		case 85:
			return jjMoveStringLiteralDfa6_0(active0, 0x8L);
		case 87:
			return jjMoveStringLiteralDfa6_0(active0, 0x20L);
		case 101:
			if ((active0 & 0x40L) != 0L) {
				jjmatchedKind = 6;
				jjmatchedPos = 5;
			}
			return jjMoveStringLiteralDfa6_0(active0, 0x4L);
		case 103:
			return jjMoveStringLiteralDfa6_0(active0, 0x80L);
		case 116:
			return jjMoveStringLiteralDfa6_0(active0, 0x10L);
		case 117:
			return jjMoveStringLiteralDfa6_0(active0, 0x8L);
		case 119:
			return jjMoveStringLiteralDfa6_0(active0, 0x20L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 5);
	}

	private int jjMoveStringLiteralDfa6_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 5);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 5);
		}
		switch (curChar) {
		case 45:
			return jjMoveStringLiteralDfa7_0(active0, 0x4L);
		case 69:
			if ((active0 & 0x80L) != 0L) {
				jjmatchedKind = 7;
				jjmatchedPos = 6;
			}
			return jjMoveStringLiteralDfa7_0(active0, 0x8L);
		case 73:
			return jjMoveStringLiteralDfa7_0(active0, 0x10L);
		case 84:
			return jjMoveStringLiteralDfa7_0(active0, 0x20L);
		case 101:
			if ((active0 & 0x80L) != 0L) {
				jjmatchedKind = 7;
				jjmatchedPos = 6;
			}
			return jjMoveStringLiteralDfa7_0(active0, 0x8L);
		case 105:
			return jjMoveStringLiteralDfa7_0(active0, 0x10L);
		case 116:
			return jjMoveStringLiteralDfa7_0(active0, 0x20L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 6);
	}

	private int jjMoveStringLiteralDfa7_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 6);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 6);
		}
		switch (curChar) {
		case 45:
			return jjMoveStringLiteralDfa8_0(active0, 0x8L);
		case 73:
			return jjMoveStringLiteralDfa8_0(active0, 0x20L);
		case 77:
			return jjMoveStringLiteralDfa8_0(active0, 0x10L);
		case 79:
			return jjMoveStringLiteralDfa8_0(active0, 0x4L);
		case 105:
			return jjMoveStringLiteralDfa8_0(active0, 0x20L);
		case 109:
			return jjMoveStringLiteralDfa8_0(active0, 0x10L);
		case 111:
			return jjMoveStringLiteralDfa8_0(active0, 0x4L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 7);
	}

	private int jjMoveStringLiteralDfa8_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 7);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 7);
		}
		switch (curChar) {
		case 69:
			return jjMoveStringLiteralDfa9_0(active0, 0x10L);
		case 70:
			if ((active0 & 0x4L) != 0L) {
				jjmatchedKind = 2;
				jjmatchedPos = 8;
			}
			break;
		case 77:
			return jjMoveStringLiteralDfa9_0(active0, 0x20L);
		case 79:
			return jjMoveStringLiteralDfa9_0(active0, 0x8L);
		case 101:
			return jjMoveStringLiteralDfa9_0(active0, 0x10L);
		case 102:
			if ((active0 & 0x4L) != 0L) {
				jjmatchedKind = 2;
				jjmatchedPos = 8;
			}
			break;
		case 109:
			return jjMoveStringLiteralDfa9_0(active0, 0x20L);
		case 111:
			return jjMoveStringLiteralDfa9_0(active0, 0x8L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 8);
	}

	private int jjMoveStringLiteralDfa9_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 8);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 8);
		}
		switch (curChar) {
		case 45:
			return jjMoveStringLiteralDfa10_0(active0, 0x10L);
		case 69:
			return jjMoveStringLiteralDfa10_0(active0, 0x20L);
		case 70:
			if ((active0 & 0x8L) != 0L) {
				jjmatchedKind = 3;
				jjmatchedPos = 9;
			}
			break;
		case 101:
			return jjMoveStringLiteralDfa10_0(active0, 0x20L);
		case 102:
			if ((active0 & 0x8L) != 0L) {
				jjmatchedKind = 3;
				jjmatchedPos = 9;
			}
			break;
		default:
			break;
		}
		return jjMoveNfa_0(2, 9);
	}

	private int jjMoveStringLiteralDfa10_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 9);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 9);
		}
		switch (curChar) {
		case 45:
			return jjMoveStringLiteralDfa11_0(active0, 0x20L);
		case 86:
			return jjMoveStringLiteralDfa11_0(active0, 0x10L);
		case 118:
			return jjMoveStringLiteralDfa11_0(active0, 0x10L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 10);
	}

	private int jjMoveStringLiteralDfa11_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 10);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 10);
		}
		switch (curChar) {
		case 65:
			return jjMoveStringLiteralDfa12_0(active0, 0x10L);
		case 86:
			return jjMoveStringLiteralDfa12_0(active0, 0x20L);
		case 97:
			return jjMoveStringLiteralDfa12_0(active0, 0x10L);
		case 118:
			return jjMoveStringLiteralDfa12_0(active0, 0x20L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 11);
	}

	private int jjMoveStringLiteralDfa12_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 11);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 11);
		}
		switch (curChar) {
		case 65:
			return jjMoveStringLiteralDfa13_0(active0, 0x20L);
		case 76:
			return jjMoveStringLiteralDfa13_0(active0, 0x10L);
		case 97:
			return jjMoveStringLiteralDfa13_0(active0, 0x20L);
		case 108:
			return jjMoveStringLiteralDfa13_0(active0, 0x10L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 12);
	}

	private int jjMoveStringLiteralDfa13_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 12);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 12);
		}
		switch (curChar) {
		case 76:
			return jjMoveStringLiteralDfa14_0(active0, 0x20L);
		case 85:
			return jjMoveStringLiteralDfa14_0(active0, 0x10L);
		case 108:
			return jjMoveStringLiteralDfa14_0(active0, 0x20L);
		case 117:
			return jjMoveStringLiteralDfa14_0(active0, 0x10L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 13);
	}

	private int jjMoveStringLiteralDfa14_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 13);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 13);
		}
		switch (curChar) {
		case 69:
			return jjMoveStringLiteralDfa15_0(active0, 0x10L);
		case 85:
			return jjMoveStringLiteralDfa15_0(active0, 0x20L);
		case 101:
			return jjMoveStringLiteralDfa15_0(active0, 0x10L);
		case 117:
			return jjMoveStringLiteralDfa15_0(active0, 0x20L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 14);
	}

	private int jjMoveStringLiteralDfa15_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 14);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 14);
		}
		switch (curChar) {
		case 45:
			return jjMoveStringLiteralDfa16_0(active0, 0x10L);
		case 69:
			return jjMoveStringLiteralDfa16_0(active0, 0x20L);
		case 101:
			return jjMoveStringLiteralDfa16_0(active0, 0x20L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 15);
	}

	private int jjMoveStringLiteralDfa16_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 15);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 15);
		}
		switch (curChar) {
		case 45:
			return jjMoveStringLiteralDfa17_0(active0, 0x20L);
		case 79:
			return jjMoveStringLiteralDfa17_0(active0, 0x10L);
		case 111:
			return jjMoveStringLiteralDfa17_0(active0, 0x10L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 16);
	}

	private int jjMoveStringLiteralDfa17_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 16);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 16);
		}
		switch (curChar) {
		case 70:
			if ((active0 & 0x10L) != 0L) {
				jjmatchedKind = 4;
				jjmatchedPos = 17;
			}
			break;
		case 79:
			return jjMoveStringLiteralDfa18_0(active0, 0x20L);
		case 102:
			if ((active0 & 0x10L) != 0L) {
				jjmatchedKind = 4;
				jjmatchedPos = 17;
			}
			break;
		case 111:
			return jjMoveStringLiteralDfa18_0(active0, 0x20L);
		default:
			break;
		}
		return jjMoveNfa_0(2, 17);
	}

	private int jjMoveStringLiteralDfa18_0(long old0, long active0) {
		active0 &= old0;
		if (active0 == 0L) {
			return jjMoveNfa_0(2, 17);
		}
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return jjMoveNfa_0(2, 17);
		}
		switch (curChar) {
		case 70:
			if ((active0 & 0x20L) != 0L) {
				jjmatchedKind = 5;
				jjmatchedPos = 18;
			}
			break;
		case 102:
			if ((active0 & 0x20L) != 0L) {
				jjmatchedKind = 5;
				jjmatchedPos = 18;
			}
			break;
		default:
			break;
		}
		return jjMoveNfa_0(2, 18);
	}

	static final long[] jjbitVec0 = { 0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL,
			0xffffffffffffffffL };
	static final long[] jjbitVec2 = { 0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL };

	private int jjMoveNfa_0(int startState, int curPos) {
		int strKind = jjmatchedKind;
		int strPos = jjmatchedPos;
		int seenUpto;
		input_stream.backup(seenUpto = curPos + 1);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			throw new Error("Internal Error");
		}
		curPos = 0;
		int startsAt = 0;
		jjnewStateCnt = 3;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff) {
				ReInitRounds();
			}
			if (curChar < 64) {
				long l = 1L << curChar;
				do {
					switch (jjstateSet[--i]) {
					case 2:
						if ((0xefffffffffffffffL & l) != 0L) {
							if (kind > 8) {
								kind = 8;
							}
							jjCheckNAdd(1);
						} else if (curChar == 60) {
							if (kind > 8) {
								kind = 8;
							}
						}
						if ((0x100002600L & l) != 0L) {
							if (kind > 1) {
								kind = 1;
							}
							jjCheckNAdd(0);
						}
						break;
					case 0:
						if ((0x100002600L & l) == 0L) {
							break;
						}
						if (kind > 1) {
							kind = 1;
						}
						jjCheckNAdd(0);
						break;
					case 1:
						if ((0xefffffffffffffffL & l) == 0L) {
							break;
						}
						if (kind > 8) {
							kind = 8;
						}
						jjCheckNAdd(1);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 2:
					case 1:
						kind = 8;
						jjCheckNAdd(1);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				int hiByte = (int) (curChar >> 8);
				int i1 = hiByte >> 6;
				long l1 = 1L << (hiByte & 077);
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 2:
					case 1:
						if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
							break;
						}
						if (kind > 8) {
							kind = 8;
						}
						jjCheckNAdd(1);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			i = jjnewStateCnt;
			if (i == (startsAt = 3 - (jjnewStateCnt = startsAt))) {
				break;
			}
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				break;
			}
		}
		if (jjmatchedPos > strPos) {
			return curPos;
		}

		int toRet = Math.max(curPos, seenUpto);

		if (curPos < toRet) {
			for (i = toRet - Math.min(curPos, seenUpto); i-- > 0;) {
				try {
					curChar = input_stream.readChar();
				} catch (java.io.IOException e) {
					throw new Error("Internal Error : Please send a bug report.");
				}
			}
		}

		if (jjmatchedPos < strPos) {
			jjmatchedKind = strKind;
			jjmatchedPos = strPos;
		} else if (jjmatchedPos == strPos && jjmatchedKind > strKind) {
			jjmatchedKind = strKind;
		}

		return toRet;
	}

	private final int jjStopStringLiteralDfa_1(int pos, long active0) {
		switch (pos) {
		default:
			return -1;
		}
	}

	private final int jjStartNfa_1(int pos, long active0) {
		return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
	}

	private int jjMoveStringLiteralDfa0_1() {
		switch (curChar) {
		case 47:
			return jjMoveStringLiteralDfa1_1(0x800L);
		case 61:
			return jjStopAtPos(0, 12);
		case 62:
			return jjStopAtPos(0, 10);
		default:
			return jjMoveNfa_1(0, 0);
		}
	}

	private int jjMoveStringLiteralDfa1_1(long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_1(0, active0);
			return 1;
		}
		switch (curChar) {
		case 62:
			if ((active0 & 0x800L) != 0L) {
				return jjStopAtPos(1, 11);
			}
			break;
		default:
			break;
		}
		return jjStartNfa_1(0, active0);
	}

	private int jjMoveNfa_1(int startState, int curPos) {
		int startsAt = 0;
		jjnewStateCnt = 3;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff) {
				ReInitRounds();
			}
			if (curChar < 64) {
				long l = 1L << curChar;
				do {
					switch (jjstateSet[--i]) {
					case 0:
						if ((0x100002600L & l) != 0L) {
							if (kind > 9) {
								kind = 9;
							}
						} else if ((0x600000000000L & l) != 0L) {
							if (kind > 16) {
								kind = 16;
							}
							jjCheckNAdd(2);
						}
						break;
					case 1:
						if ((0x600000000000L & l) == 0L) {
							break;
						}
						if (kind > 16) {
							kind = 16;
						}
						jjCheckNAdd(2);
						break;
					case 2:
						if ((0x3ff600000000000L & l) == 0L) {
							break;
						}
						if (kind > 16) {
							kind = 16;
						}
						jjCheckNAdd(2);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 0:
					case 2:
						if ((0x7fffffe87fffffeL & l) == 0L) {
							break;
						}
						if (kind > 16) {
							kind = 16;
						}
						jjCheckNAdd(2);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				int hiByte = (int) (curChar >> 8);
				int i1 = hiByte >> 6;
				long l1 = 1L << (hiByte & 077);
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					default:
						break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			i = jjnewStateCnt;
			if (i == (startsAt = 3 - (jjnewStateCnt = startsAt))) {
				return curPos;
			}
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				return curPos;
			}
		}
	}

	private int jjMoveStringLiteralDfa0_2() {
		return jjMoveNfa_2(0, 0);
	}

	private int jjMoveNfa_2(int startState, int curPos) {
		int startsAt = 0;
		jjnewStateCnt = 7;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff) {
				ReInitRounds();
			}
			if (curChar < 64) {
				long l = 1L << curChar;
				do {
					switch (jjstateSet[--i]) {
					case 0:
						if ((0xbfffff7affffd9ffL & l) != 0L) {
							if (kind > 17) {
								kind = 17;
							}
							jjCheckNAdd(6);
						} else if (curChar == 34) {
							jjCheckNAddTwoStates(4, 5);
						} else if (curChar == 39) {
							jjCheckNAddTwoStates(1, 2);
						}
						break;
					case 1:
						if ((0xffffff7fffffffffL & l) != 0L) {
							jjCheckNAddTwoStates(1, 2);
						}
						break;
					case 2:
						if (curChar == 39 && kind > 17) {
							kind = 17;
						}
						break;
					case 3:
						if (curChar == 34) {
							jjCheckNAddTwoStates(4, 5);
						}
						break;
					case 4:
						if ((0xfffffffbffffffffL & l) != 0L) {
							jjCheckNAddTwoStates(4, 5);
						}
						break;
					case 5:
						if (curChar == 34 && kind > 17) {
							kind = 17;
						}
						break;
					case 6:
						if ((0xbfffff7affffd9ffL & l) == 0L) {
							break;
						}
						if (kind > 17) {
							kind = 17;
						}
						jjCheckNAdd(6);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 0:
					case 6:
						if (kind > 17) {
							kind = 17;
						}
						jjCheckNAdd(6);
						break;
					case 1:
						jjAddStates(0, 1);
						break;
					case 4:
						jjAddStates(2, 3);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				int hiByte = (int) (curChar >> 8);
				int i1 = hiByte >> 6;
				long l1 = 1L << (hiByte & 077);
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 0:
					case 6:
						if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
							break;
						}
						if (kind > 17) {
							kind = 17;
						}
						jjCheckNAdd(6);
						break;
					case 1:
						if (jjCanMove_0(hiByte, i1, i2, l1, l2)) {
							jjAddStates(0, 1);
						}
						break;
					case 4:
						if (jjCanMove_0(hiByte, i1, i2, l1, l2)) {
							jjAddStates(2, 3);
						}
						break;
					default:
						break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			i = jjnewStateCnt;
			if (i == (startsAt = 7 - (jjnewStateCnt = startsAt))) {
				return curPos;
			}
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				return curPos;
			}
		}
	}

	static final int[] jjnextStates = { 1, 2, 4, 5, };

	private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2) {
		switch (hiByte) {
		case 0:
			return ((jjbitVec2[i2] & l2) != 0L);
		default:
			if ((jjbitVec0[i1] & l1) != 0L) {
				return true;
			}
			return false;
		}
	}

	/** Token literal values. */
	public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, null, null, null, null, "\76",
			"\57\76", "\75", null, null, null, null, null, };

	/** Lexer state names. */
	public static final String[] lexStateNames = { "DEFAULT", "ATTLIST", "ATTRVAL", };

	/** Lex State array. */
	public static final int[] jjnewLexState = { -1, -1, 1, 1, 1, 1, 1, 1, -1, -1, 0, 0, 2, -1, -1, -1, -1, 1, };
	static final long[] jjtoToken = { 0x31dfdL, };
	static final long[] jjtoSkip = { 0x202L, };
	protected SimpleCharStream input_stream;
	private final int[] jjrounds = new int[7];
	private final int[] jjstateSet = new int[14];
	protected char curChar;

	/** Constructor. */
	public ParserTokenManager(SimpleCharStream stream) {
		if (SimpleCharStream.staticFlag) {
			throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
		}
		input_stream = stream;
	}

	/** Constructor. */
	public ParserTokenManager(SimpleCharStream stream, int lexState) {
		this(stream);
		SwitchTo(lexState);
	}

	/** Reinitialise parser. */
	public void ReInit(SimpleCharStream stream) {
		jjmatchedPos = jjnewStateCnt = 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}

	private void ReInitRounds() {
		int i;
		jjround = 0x80000001;
		for (i = 7; i-- > 0;) {
			jjrounds[i] = 0x80000000;
		}
	}

	/** Reinitialise parser. */
	public void ReInit(SimpleCharStream stream, int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	/** Switch to specified lex state. */
	public void SwitchTo(int lexState) {
		if (lexState >= 3 || lexState < 0) {
			throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.",
					TokenMgrError.INVALID_LEXICAL_STATE);
		} else {
			curLexState = lexState;
		}
	}

	protected Token jjFillToken() {
		final Token t;
		final String curTokenImage;
		final int beginLine;
		final int endLine;
		final int beginColumn;
		final int endColumn;
		String im = jjstrLiteralImages[jjmatchedKind];
		curTokenImage = (im == null) ? input_stream.GetImage() : im;
		beginLine = input_stream.getBeginLine();
		beginColumn = input_stream.getBeginColumn();
		endLine = input_stream.getEndLine();
		endColumn = input_stream.getEndColumn();
		t = Token.newToken(jjmatchedKind, curTokenImage);

		t.beginLine = beginLine;
		t.endLine = endLine;
		t.beginColumn = beginColumn;
		t.endColumn = endColumn;

		return t;
	}

	int curLexState = 0;
	int defaultLexState = 0;
	int jjnewStateCnt;
	int jjround;
	int jjmatchedPos;
	int jjmatchedKind;

	/** Get the next Token. */
	public Token getNextToken() {
		Token matchedToken;
		int curPos = 0;

		EOFLoop: for (;;) {
			try {
				curChar = input_stream.BeginToken();
			} catch (java.io.IOException e) {
				jjmatchedKind = 0;
				matchedToken = jjFillToken();
				return matchedToken;
			}

			switch (curLexState) {
			case 0:
				jjmatchedKind = 0x7fffffff;
				jjmatchedPos = 0;
				curPos = jjMoveStringLiteralDfa0_0();
				break;
			case 1:
				jjmatchedKind = 0x7fffffff;
				jjmatchedPos = 0;
				curPos = jjMoveStringLiteralDfa0_1();
				break;
			case 2:
				jjmatchedKind = 0x7fffffff;
				jjmatchedPos = 0;
				curPos = jjMoveStringLiteralDfa0_2();
				break;
			}
			if (jjmatchedKind != 0x7fffffff) {
				if (jjmatchedPos + 1 < curPos) {
					input_stream.backup(curPos - jjmatchedPos - 1);
				}
				if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
					matchedToken = jjFillToken();
					if (jjnewLexState[jjmatchedKind] != -1) {
						curLexState = jjnewLexState[jjmatchedKind];
					}
					return matchedToken;
				} else {
					if (jjnewLexState[jjmatchedKind] != -1) {
						curLexState = jjnewLexState[jjmatchedKind];
					}
					continue EOFLoop;
				}
			}
			int error_line = input_stream.getEndLine();
			int error_column = input_stream.getEndColumn();
			String error_after = null;
			boolean EOFSeen = false;
			try {
				input_stream.readChar();
				input_stream.backup(1);
			} catch (java.io.IOException e1) {
				EOFSeen = true;
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
				if (curChar == '\n' || curChar == '\r') {
					error_line++;
					error_column = 0;
				} else {
					error_column++;
				}
			}
			if (!EOFSeen) {
				input_stream.backup(1);
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
			}
			throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar,
					TokenMgrError.LEXICAL_ERROR);
		}
	}

	private void jjCheckNAdd(int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}

	private void jjAddStates(int start, int end) {
		do {
			jjstateSet[jjnewStateCnt++] = jjnextStates[start];
		} while (start++ != end);
	}

	private void jjCheckNAddTwoStates(int state1, int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}

}
