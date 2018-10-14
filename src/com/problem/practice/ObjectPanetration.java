package com.problem.practice;

/*
 * 
 * Given a base64 object panetrate a field in object and convert it base 64 again
 * should be equal to provided out put
 * 
 * 
 * 
 * */

public class ObjectPanetration {
	public static void main(String[] args) throws Exception {
		boolean result0 = Solution.penetrate(
				"rO0ABXNyAChjb20ubm9ydGFsLnRlc3Rhc3NpZ25tZW50LlNvbHV0aW9uJE1vbmV5fcOyKnEpkOsCAAFJAAV2YWx1ZXhwAAAACg==",
				"value", 100)
				.equals("rO0ABXNyAChjb20ubm9ydGFsLnRlc3Rhc3NpZ25tZW50LlNvbHV0aW9uJE1vbmV5fcOyKnEpkOsCAAFJAAV2YWx1ZXhwAAAAZA==");

		boolean result1 = Solution.penetrate(
				"rO0ABXNyADRjb20ubm9ydGFsLnRlc3Rhc3NpZ25tZW50LlNvbHV0aW9uJE1vbmV5V2l0aEN1cnJlbmN564gdEMbOaSMCAAJJAAZhbW91bnRMAAhjdXJyZW5jeXQAEkxqYXZhL2xhbmcvU3RyaW5nO3hwAAAAFHQAAA==",
				"amount", 50)
				.equals("rO0ABXNyADRjb20ubm9ydGFsLnRlc3Rhc3NpZ25tZW50LlNvbHV0aW9uJE1vbmV5V2l0aEN1cnJlbmN564gdEMbOaSMCAAJJAAZhbW91bnRMAAhjdXJyZW5jeXQAEkxqYXZhL2xhbmcvU3RyaW5nO3hwAAAAMnQAAA");
		boolean result2 = Solution.penetrate(
				"rO0ABXNyAD1jb20ubm9ydGFsLnRlc3Rhc3NpZ25tZW50LlNvbHV0aW9uJE1vbmV5V2l0aEN1cnJlbmN5QW5kU2VyaWFsuqZsiGo8930CAANJAAdfYW1vdW50TAAJX2N1cnJlbmN5dAASTGphdmEvbGFuZy9TdHJpbmc7TAAHX3NlcmlhbHEAfgABeHAAAABkdAAAcQB+AAM=",
				"_amount", 1)
				.equals("rO0ABXNyAD1jb20ubm9ydGFsLnRlc3Rhc3NpZ25tZW50LlNvbHV0aW9uJE1vbmV5V2l0aEN1cnJlbmN5QW5kU2VyaWFsuqZsiGo8930CAANJAAdfYW1vdW50TAAJX2N1cnJlbmN5dAASTGphdmEvbGFuZy9TdHJpbmc7TAAHX3NlcmlhbHEAfgABeHAAAAABdAAAcQB+AAM=");
	}
}
